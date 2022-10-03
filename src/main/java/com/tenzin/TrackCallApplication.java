package com.tenzin;

import com.tenzin.model.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "com.tenzin")

public class TrackCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackCallApplication.class, args);
	}

}
