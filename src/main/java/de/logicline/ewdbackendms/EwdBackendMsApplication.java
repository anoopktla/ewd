package de.logicline.ewdbackendms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("de.logicline.c8y")
@SpringBootApplication
public class EwdBackendMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EwdBackendMsApplication.class, args);
	}

}

