package com.example.SneakyCaloriesV2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = {"con.example.SneakyCaloriesV2.pojo"})
public class SneakyCaloriesApplicationV2 {
	public static void main(String[] args) {	
		SpringApplication.run(SneakyCaloriesApplicationV2.class, args);
	}
}
