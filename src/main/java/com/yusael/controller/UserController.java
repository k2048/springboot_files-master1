package com.yusael.controller;

import com.yusael.entity.User;
import com.yusael.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录方法
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        User userDB = userService.login(user);
        if (userDB != null) {
            session.setAttribute("user", userDB);
            return "redirect:/file/showAll";
        } else {
            model.addAttribute("errorMsg","登录失败");
            return "redirect:/index";
        }
    }

    @PostMapping("/show")
    public List<User> showUsers(HttpSession session, Model model){

        List<User> users =  userService.showUsers();
        System.out.println("运行到此处");

        return users;
    }

}
