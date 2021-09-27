package pl.ngalda.envers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.ngalda.envers.model.Post;

import javax.persistence.EntityManager;

@SpringBootApplication
public class EnversApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnversApplication.class, args);
	}

}
