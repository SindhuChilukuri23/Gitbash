package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String[] getCity() {
		return new String[] {"chennai","hyd","pune"};
	}

}
