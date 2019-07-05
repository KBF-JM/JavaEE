package org.kbf.jmshome.controller;

import org.kbf.jmshome.service.SigninService;
import org.kbf.jmshome.service.UserService;
import org.kbf.jmshome.auxiliary.Msg;
import org.kbf.jmshome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("signin")
public class SigninController {
    @Autowired
    public SigninService signinService;

    @Autowired
    public UserService userService;

    @RequestMapping("countNum")
    @ResponseBody
    public Msg getSigninCount(@RequestBody User user) {
        String userId=userService.findByUserName(user.getUsername()).getId();
        int result = signinService.isSignin(userId);
        if (result == 0){
            signinService.toSignin(userId);
            int continueDay=signinService.getSigninCountNum(userId);
            return Msg.success("恭喜您今日签到成功！已连续签到"+continueDay+"天");
        }
        else
            return Msg.success("您今日已签到，无需再次签到！");
    }
}
