package it.sample.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SoluzioneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoluzioneApplication.class, args);
	}

}
