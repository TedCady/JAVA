package com.cady.loginreg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cady.loginreg.models.User;
import com.cady.loginreg.services.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String redirect(@ModelAttribute("user") User user) {
        return "redirect:/registration";
    }

    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "register";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "register";
        } else {
            session.setAttribute("user", (Long) userService.registerUser(user).getId());
            return "redirect:/home";
        }
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
            HttpSession session) {
        if (userService.authenticateUser(email, password)) {
            session.setAttribute("user", (Long) userService.findByEmail(email).getId());
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Not authenticated");
            return "login";
        }
    }

    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        model.addAttribute("user", userService.findUserById((Long) session.getAttribute("user")));
        return "home";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}