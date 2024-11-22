package com.devtiro.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("/hello/application.properties")
public class QuickstartApplication {

	public static void main(String[] args) {
	  SpringApplication.run(QuickstartApplication.class, args);

	}

}
