package aliboung.demo;

import aliboung.demo.Entity.Author;
import aliboung.demo.Entity.Video;
import aliboung.demo.Repository.AuthorRepository;


import aliboung.demo.Repository.VideoRepository;


import com.github.javafaker.Faker;
//import lombok.var;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaTutorialApplication.class, args);
	}


	/*@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository) {

		return args -> {

			for(int i=0;i<50;i++){
				Faker faker = new Faker();

				var  author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(19,50))
						.email("contact"+i+"@gmail.com")
						.build();

				repository.save(author);
			}*/

		/*	var video = Video.builder()
					.name("Abc")
					.length(4)
					.build();

			videoRepository.save(video);

		};

	}*/
}
