package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
