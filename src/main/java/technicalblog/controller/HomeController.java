package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPost(Model model){

        ArrayList<Post> posts = new ArrayList<Post>();
        Post post1 = new Post();
        post1.setTitle("Title 1");
        post1.setBody("Body for Title 1");
        post1.setDate(new Date());

        posts.add(post1);

        Post post2 = new Post();
        post2.setTitle("Title 2");
        post2.setBody("Body for Title 2");
        post2.setDate(new Date());

        posts.add(post2);

        Post post3 = new Post();
        post3.setTitle("Title 3");
        post3.setBody("Body for Title 3");
        post3.setDate(new Date());

        posts.add(post3);

        model.addAttribute("posts",posts);

        return "index";

    }
}
