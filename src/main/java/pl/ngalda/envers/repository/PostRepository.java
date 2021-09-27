package pl.ngalda.envers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ngalda.envers.model.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
}
