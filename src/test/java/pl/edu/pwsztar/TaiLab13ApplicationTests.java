package pl.edu.pwsztar;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.pwsztar.service.PostService;
import pl.edu.pwsztar.service.impl.PostServiceImpl;

@SpringBootTest
class TaiLab13ApplicationTests {

	@Test
	void contextLoads() {
		PostService postService = new PostServiceImpl();
		System.out.println(postService.getAll());
	}

}
