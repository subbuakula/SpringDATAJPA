package com.subbu.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subbu.SpringDataJPA.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		VaccineServiceImpl service = context.getBean(VaccineServiceImpl.class);
		service.getAllVaccines().forEach(v -> System.out.println(v));
	}

}
