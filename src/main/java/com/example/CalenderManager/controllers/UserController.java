package com.example.CalenderManager.controllers;

import com.example.CalenderManager.models.User;
import com.example.CalenderManager.services.MyUserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String registrationPage() {
        return "registration";
    }

    @PostMapping("/postregistration")
    public String postRegistration(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        user.setRoles("USER");
        userService.registerUser(user);
        return "redirect:/";
    }
}
