package br.com.basis.prova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({LiquibaseProperties.class})
public class ProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

}
