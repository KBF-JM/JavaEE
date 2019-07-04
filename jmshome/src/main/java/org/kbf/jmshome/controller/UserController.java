package org.kbf.jmshome.controller;

import com.alibaba.druid.support.json.JSONUtils;
import org.kbf.jmshome.Service.UserService;
import org.kbf.jmshome.auxiliary.Msg;
import org.kbf.jmshome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Msg Login(@RequestParam("userName") String userName, @RequestParam("userPwd") String userPwd) {

        if (userName.equals("") || userPwd.equals("")) {
            return Msg.fail().add("msg", "用户名/密码不为空！！！");
        }
        int result = userService.CheckUser(userName, userPwd);
        if (result != -1)
            return Msg.success(String.valueOf(result));
        return Msg.fail().add("msg", "用户名/密码不正确，请检查后重新登录！！！");
    }

    @RequestMapping("registered")
    @ResponseBody
    public Msg ToRegistered(@RequestParam("registeredWay") String toRegisteredWay, @RequestParam("registeredName") String toRegisteredName, @RequestParam("registeredPwd") String toRegisteredPwd) {
        User user = new User();
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
        String userId = formatter.format(currentTime);
        userId += (int) ((Math.random() * 9 + 1) * 100000);
        user.setId(userId);
        user.setEmail(toRegisteredWay);
        user.setUsername(toRegisteredName);
        user.setPassword(toRegisteredPwd);
        user.setRegisteredtime(currentTime);
        user.setUsertype(0);
        userService.Registered(user);
        return Msg.success();
    }


    @RequestMapping("resetPassWord")
    public String ResetPassWord() {
        return "resetPassWord";
    }

    @RequestMapping("userCenter")
    public String UserCenter() {
        return "personCenter";
    }

    @RequestMapping(value = "userInformation", method = RequestMethod.POST)
    @ResponseBody
    public Msg GetUserInformation(@RequestParam("userName") String userName) {
        User user = userService.findByUserName(userName);
        String result = JSONUtils.toJSONString(user);
        return Msg.success(result);
    }

    @RequestMapping("console")
    public String ToConsole() {
        return "console";
    }

    @RequestMapping("getUserList")
    @ResponseBody
    public String GetUserInformation() {
        return userService.GetUserInformation();
    }

}
