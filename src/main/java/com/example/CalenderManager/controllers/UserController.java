package com.example.CalenderManager.controllers;

import com.example.CalenderManager.services.MyUserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private final MyUserService userService;

    public UserController(MyUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/profile")
    public String userPage(Authentication authentication, Model model) {
        return "nonauthentication";

//        if (authentication.isAuthenticated()) {
//            model.addAttribute("username", userService.findByUsername(authentication.getName()));
//            return "profile";
//        }

    }
}
