package spring_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring_hibernate.model.User;
import spring_hibernate.service.UserService;

@Controller
public class MyController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String getAllUsers(Model model) {
        var users = service.getAllUsers();
        model.addAttribute("allUsers", users);
        return "/show-users";
    }
    @GetMapping("/addUser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "info-user";
    }
    @PostMapping()
    public String saveUser(@ModelAttribute("user") User user) {
        service.addUser(user);
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
    public String returnUser(@PathVariable("id") int id, Model model) {
        User user = service.getUserById(id);
        model.addAttribute(user);
        System.out.println("update1");
        return "info-user";
    }
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("user") User user) {
        service.updateUser(user);
        System.out.println("update2");
        return "redirect:/";
    }
}
