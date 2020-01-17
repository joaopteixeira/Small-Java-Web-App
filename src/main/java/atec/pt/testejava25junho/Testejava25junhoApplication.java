package atec.pt.testejava25junho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Testejava25junhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Testejava25junhoApplication.class, args);
		System.out.println("teste is running");
	}
}
