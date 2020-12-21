package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Muhammad Saimon
 * @since Dec 19, 2020 18:51
 */

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String showHome(Model model) {
        model.addAttribute("welcomeText", "Welcome to Spring Security");
        return "home";
    }

    @GetMapping("/hello")
    public String helloUser() {
        return "hello-user";
    }

    @GetMapping("/login")
    public String loginUser() {
        return "login";
    }

}
