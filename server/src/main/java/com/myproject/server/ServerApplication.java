package com.myproject.server;

import com.myproject.server.model.Todo;
import com.myproject.server.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Configuration

public class ServerApplication {


	@Autowired
	private TodoRepository todoRepository;


	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}


}
