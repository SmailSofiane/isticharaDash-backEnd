package dz.miclat.isticharaDash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class IsticharaDashApplication {
	public static void main(String[] args) {
		SpringApplication.run(IsticharaDashApplication.class, args);
	}
}
