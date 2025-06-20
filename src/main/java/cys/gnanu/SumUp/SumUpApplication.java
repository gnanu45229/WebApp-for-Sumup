package cys.gnanu.SumUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "cys.gnanu.SumUp.repo")
public class SumUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumUpApplication.class, args);
	}

}
