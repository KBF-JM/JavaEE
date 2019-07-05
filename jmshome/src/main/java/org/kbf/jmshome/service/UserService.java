package org.kbf.jmshome.service;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.kbf.jmshome.auxiliary.DateJsonValueProcessor;
import org.kbf.jmshome.model.User;
import org.kbf.jmshome.model.UserExample;
import org.kbf.jmshome.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    private String formatByDate="yyyy-MM-dd";

    public void SaveByKey(User user) {
        userMapper.insertSelective(user);
    }

    public int CheckUser(String userName, String userPwd) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName).andPasswordEqualTo(userPwd);
        userExample.setDistinct(true);
        List<User> list = userMapper.selectByExample(userExample);
        if (list.isEmpty() == false) {
            User user = list.get(0);
            return user.getUsertype();
        }
        return -1;
    }

    public void RegisterUser(User user) {
        userMapper.insert(user);
    }

    public String convertMD5(String pwd) {
        char[] a = pwd.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }

    public User findByUserName(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        userExample.setDistinct(true);
        return userMapper.selectByExample(userExample).stream().findFirst().orElse(null);
    }

    public void Registered(User user) {
        userMapper.insert(user);
    }

    public String GetUserInformation() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameIsNotNull();
        List<User> result = userMapper.selectByExample(userExample);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.sql.Timestamp.class, new DateJsonValueProcessor(formatByDate));
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(formatByDate));
        return JSONArray.fromObject(result,jsonConfig).toString();
    }
}
