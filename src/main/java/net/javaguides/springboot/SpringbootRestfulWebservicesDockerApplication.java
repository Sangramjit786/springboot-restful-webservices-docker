package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
info = @Info(
		title = "Department Service REST APIs",
		description = "Department Service REST APIs Documentation",
		version = "v1.0",
		contact = @Contact(
				name = "Rohit",
				email = "nathrohit48@gmail.com",
				url = "https://www.javaguides.net"
		),
		license = @License(
				name = "Apache 2.0",
				url = "https://www.javaguides.net"
		)
),
externalDocs = @ExternalDocumentation(
		description = "Department-Service Doc",
		url = "https://www.javaguides.net"
)
)
@SpringBootApplication
public class SpringbootRestfulWebservicesDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesDockerApplication.class, args);
	}

}
