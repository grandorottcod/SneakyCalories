package com.example.SneakyCaloriesV2.core;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class AppDto {
	private Map<String, Object> transactionData = null;
	
	public AppDto() {
		transactionData = new HashMap<>();
	}
	
	public Object get(String key) {
		return transactionData.get(key);
	}
	
	public void set(String key, Object object) {
		transactionData.put(key, object);
	}
}
