package pl.edu.pwsztar.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.entity.Post;
import pl.edu.pwsztar.service.PostService;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @CrossOrigin
    @GetMapping("/api/posts")
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    @CrossOrigin
    @GetMapping("/api/posts/{id}")
    public Post get(@PathVariable int id) {
        return postService.get(id);
    }
}
