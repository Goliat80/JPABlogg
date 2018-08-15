package com.example.jpadb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostsController {

    @Autowired
    private PostsRepository postRepostory;

   // @GetMapping("/posts/{Headline}/{Post}")
   @GetMapping ("/posts")
   public String getposts (Model model){
       List<Posts> Posts = (List<Posts>) postRepostory.findAll();
       for (int i =0; i < Posts.size(); i++) {
           System.out.println(Posts.get(i).getHeadline());
           System.out.println(Posts.get(i).getPost());
                  }
       model.addAttribute("Posts", Posts);
       return "blogg";
   }

   @PostMapping("/posts")
    public String addposts(Posts posts){
        postRepostory.save(new Posts(posts.getPost(), posts.getHeadline()));
        return "blogg";
    }

}
