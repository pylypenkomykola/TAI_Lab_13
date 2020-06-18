package pl.edu.pwsztar.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import
        org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.edu.pwsztar.domain.entity.Post;
import pl.edu.pwsztar.domain.repository.PostRepository;
import pl.edu.pwsztar.service.PostService;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PostResource{
    private final PostService postService;

    private final PostRepository postRepository;

    @Autowired
    public PostResource(PostService postService, PostRepository postRepository) {
        this.postService = postService;
        this.postRepository = postRepository;
    }

    @GetMapping(value = "/api/posts")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping(value = "/api/posts/{id}")
    public Post get(@PathVariable long id) {
        return postRepository.findById(id).get();
    }

    @PostMapping(value = "/api/posts")
    public ResponseEntity<Void> createPost(@RequestBody Post post) {
        Post postUpdated = postRepository.save(post);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()

                .path("/{id").buildAndExpand(postUpdated.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
