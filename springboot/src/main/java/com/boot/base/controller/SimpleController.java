package com.boot.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.base.service.SimpleService;

@Controller
@RequestMapping("/simple")
public class SimpleController {

	@Autowired
	private SimpleService simpleService;

	@RequestMapping("/test1")
	@ResponseBody
	public Object home() {
		/**
		 * \ 反斜杠转义自定义Json
		 */
		return simpleService.selectUser("{\"name\":\"test\"}");

	}

	@RequestMapping("/test2")
	@ResponseBody
	public int index() {
		return simpleService.JDK_1_8_ServiceMethodCanImplBySelf();
	}

}
