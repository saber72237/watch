package com.yygq.watch.control;

import com.yygq.watch.bean.User;
import com.yygq.watch.mapper.UserMapper;
import com.yygq.watch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class DeptController {


    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @GetMapping("/userinfo")
    public ModelAndView getUser(HttpSession session,Model model){
        session.getAttribute("loginUser");
        if(session.getAttribute("loginUser")!=null) {
            User user = userService.findByName((String) session.getAttribute("loginUser"));
            model.addAttribute("user", user);
            return new ModelAndView("userinfo/userinfo");
        }
        else {
            return null;
        }
    }

    @GetMapping("/quit")
    public ModelAndView Quit(HttpSession session){
        if(session.getAttribute("loginUser") !=null){
            session.removeAttribute("loginUser");
            return new ModelAndView("login/login");
        }
        else {
            return null;
        }
    }

    @GetMapping("/update")
    public ModelAndView getPW(HttpSession session,Model model){
        session.getAttribute("loginUser");
        if(session.getAttribute("loginUser")!=null) {
            User user = userService.findByName((String) session.getAttribute("loginUser"));
            model.addAttribute("user", user);
            return new ModelAndView("userinfo/updatepw");
        }
        else {
            return null;
        }
    }

    @PostMapping(value = "/updatePW")
    public ModelAndView login(@RequestParam("oldPassword") String oldPassword,
                        @RequestParam("newPassword") String newPassword,
                        @RequestParam("rePassword") String rePassword,
                        Map<String,Object> map, HttpSession session){
        User user = userService.findByName((String) session.getAttribute("loginUser"));
        if(oldPassword.equals(user.getPassword())&&newPassword.equals(rePassword)){
            user.setPassword(rePassword);
            int flag = userService.updateDept(user);
            return new ModelAndView("userinfo/success");
        }
        else {
            return null;
        }
    }
}
