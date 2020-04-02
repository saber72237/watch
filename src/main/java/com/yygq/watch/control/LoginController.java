package com.yygq.watch.control;

import com.yygq.watch.bean.User;
import com.yygq.watch.mapper.UserMapper;
import com.yygq.watch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;


    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        User user = userService.findByName(username);
        if(username.equals(user.getUserName())&&password.equals(user.getPassword())){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else {
            map.put("msg","用户名密码错误");
            return "redirect:/login/login";
        }
    }
}
