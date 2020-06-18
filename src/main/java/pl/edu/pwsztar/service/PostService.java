package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAll();
    Post get(int id);
}
