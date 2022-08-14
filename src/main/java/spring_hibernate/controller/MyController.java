package spring_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring_hibernate.service.UserService;

@Controller
public class MyController {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public String getAllUsers(Model model) {
        var users = service.getAllUsers();
        model.addAttribute("allUsers", users);
        return "/show-users";
    }
}
