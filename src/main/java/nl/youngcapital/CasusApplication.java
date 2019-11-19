package nl.youngcapital;

import nl.youngcapital.domain.User;
import nl.youngcapital.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class CasusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasusApplication.class, args);
	}

/*	Test to see if the database is being filled
*
* 	@Bean
*	CommandLineRunner init(UserRepository userRepository) {
*		return args -> {
*			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
*				User user = new User(name, name.toLowerCase() + "@domain.com");
*				userRepository.save(user);
*   		});
*			userRepository.findAll().forEach(System.out::println);
*		};
*	}
*/
}
