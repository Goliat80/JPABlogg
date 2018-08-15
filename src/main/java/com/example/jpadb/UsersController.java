package com.example.jpadb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUser(Model model) {
        List<Users> Users = (List<Users>) usersRepository.findAll();
        for (int i = 0; i < Users.size(); i++) {
            System.out.println(Users.get(i).getUsername());
        }
        model.addAttribute("Users", Users);
        return "index";
    }


    @GetMapping("/add/{Username}/{Password}/{Email}")
    public String addUser(@PathVariable String Username,
                          @PathVariable String Password,
                          @PathVariable String Email,
                          Model model) {
        usersRepository.save(new Users(Username,Password,Email));

        model.addAttribute("username", Username);
        model.addAttribute("email", Email);        return "ok";
    }


}
