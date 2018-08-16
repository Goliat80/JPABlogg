package com.example.jpadb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.validation.BindingResult;
=======
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

<<<<<<< HEAD
import javax.validation.Valid;
=======
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
<<<<<<< HEAD
    public String getUser(Model model) {
=======
    public String getPersons(Model model) {
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad
        List<Users> Users = (List<Users>) usersRepository.findAll();
        for (int i = 0; i < Users.size(); i++) {
            System.out.println(Users.get(i).getUsername());
        }
        model.addAttribute("Users", Users);
        return "index";
    }

<<<<<<< HEAD

    @GetMapping("/add/{Username}/{Password}/{Email}")
    public String addUser(@PathVariable String Username,
                          @PathVariable String Password,
                          @PathVariable String Email,
                          Model model) {
        usersRepository.save(new Users(Username,Password,Email));

        model.addAttribute("username", Username);
        model.addAttribute("email", Email);        return "ok";
    }


=======
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
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad
}
