package com.boot.base.service.impl;

import org.springframework.stereotype.Service;

import com.boot.base.service.SimpleService;

@Service
public class SimpleServiceImpl implements SimpleService{

	@Override
	public Object selectUser(Object object) {
		return object;
	}

}
