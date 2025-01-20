package aliboung.demo.Repository;

import aliboung.demo.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {

}
