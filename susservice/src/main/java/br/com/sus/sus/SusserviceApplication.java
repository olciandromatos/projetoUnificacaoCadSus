package br.com.sus.sus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="br.com.sus.resource")
public class SusserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SusserviceApplication.class, args);
	}

}

