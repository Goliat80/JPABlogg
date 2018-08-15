package com.example.jpadb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public String getPersons(Model model) {
        List<persons> persons = (List<persons>) personRepository.findAll();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).getName());
        }
        model.addAttribute("persons", persons);
        return "index";
    }

    @GetMapping("/add/{name}")
    public String addPerson(@PathVariable String name) {
        personRepository.save(new persons(name));
        return "ok";
    }
}
