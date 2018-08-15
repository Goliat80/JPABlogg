package com.example.jpadb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getPersons(Model model) {
        List<Users> Users = (List<Users>) usersRepository.findAll();
        for (int i = 0; i < Users.size(); i++) {
            System.out.println(Users.get(i).getUsername());
        }
        model.addAttribute("Users", Users);
        return "index";
    }

    @GetMapping("/add/{UserName}/{Password}/{Email}")
    public String addPerson(@PathVariable String UserName,
                            @PathVariable String Password,
                            @PathVariable String Email,
                            Model model) {
        usersRepository.save(new Users(UserName,Password,Email));

        model.addAttribute("User",UserName);
        model.addAttribute("Email",Email);
        return "ok";
    }
}
