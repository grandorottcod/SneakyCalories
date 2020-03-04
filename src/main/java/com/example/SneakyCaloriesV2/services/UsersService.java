package com.example.SneakyCaloriesV2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SneakyCaloriesV2.core.AppDto;
import com.example.SneakyCaloriesV2.daos.UsersDao;
import com.example.SneakyCaloriesV2.pojo.Users;

@Component
public class UsersService implements UsersServiceImpl {
	
	@Autowired
	UsersDao userDao;

	@Override
	public void createUser(AppDto appDto) {
		Users user = (Users)appDto.get("user");
		userDao.createNewUser(user);
	}
	
}
