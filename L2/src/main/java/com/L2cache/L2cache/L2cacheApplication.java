package com.L2cache.L2cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class L2cacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(L2cacheApplication.class, args);
	}

}
