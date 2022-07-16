package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Kafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafka1Application.class, args);
		System.out.println("privet");

		//MsgController msgController = new MsgController();
		//msgController.sendOrder("1", "privet");
		System.out.println("off");

	}

}
