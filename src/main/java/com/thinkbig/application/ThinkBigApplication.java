package com.thinkbig.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.thinkbig"})
public class ThinkBigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkBigApplication.class, args);
	}
}
