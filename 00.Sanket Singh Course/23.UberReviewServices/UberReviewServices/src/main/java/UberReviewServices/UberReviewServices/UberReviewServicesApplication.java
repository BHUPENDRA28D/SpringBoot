package UberReviewServices.UberReviewServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class UberReviewServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberReviewServicesApplication.class, args);
	}

}
