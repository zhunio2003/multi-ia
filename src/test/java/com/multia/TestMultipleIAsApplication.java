package com.multia;

import org.springframework.boot.SpringApplication;

public class TestMultipleIAsApplication {

	public static void main(String[] args) {
		SpringApplication.from(MultipleIAsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
