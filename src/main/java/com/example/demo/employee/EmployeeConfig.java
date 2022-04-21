package com.example.demo.employee;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository repository){
		
		return args -> {
			Employee shashi = new Employee("shashi","shashi.kiran@gmail.com",LocalDate.of(1990, 10, 05));
			Employee kiran = new Employee("kiran","kiran.shashi@gmail.com",LocalDate.of(1991, 10, 05));
			
			repository.saveAll(List.of(shashi,kiran));

		};
	}

}
