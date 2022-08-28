package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Controller
public class SpringController {


    private final UserDAO userDAO;

    public SpringController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

    @GetMapping("/users")
    public String showAllUsers(Model model){
        model.addAttribute("allUsers", userDAO.getAllUsers());
        return "all-users";
    }
}
