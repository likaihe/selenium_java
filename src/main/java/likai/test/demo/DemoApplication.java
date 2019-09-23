package likai.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		final TestRunner testRunner = new TestRunner();
		SpringApplication.run(DemoApplication.class, args);
		testRunner.start();

	}

}
