package com.example.SneakyCaloriesV2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SneakyCaloriesV2.core.AppDto;
import com.example.SneakyCaloriesV2.pojo.Users;
import com.example.SneakyCaloriesV2.services.UsersService;

@RestController
public class UserDataController {
	
	
	@Autowired
	UsersService usersService;
	

	@PostMapping(value ="/sign_up")
	public ResponseEntity getRegister(@RequestBody Users user) {
		AppDto appDto = new AppDto();
		appDto.set("user", user);
		usersService.createUser(appDto);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	

}
