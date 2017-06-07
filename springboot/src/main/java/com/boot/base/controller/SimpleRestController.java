package com.boot.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.base.service.SimpleService;

/**
 * 注意这里使用的是@RestController
 * 这个意思是说不用像SimpleController中的方法需要添加
 * @ResponseBody注解，才会以json的形式输出
 * @RestController = @Controller + @ResponseBody
 * @author Curio
 *
 *
 *
 *官方文档：
	@RestController is a stereotype annotation that combines @ResponseBody and @Controller.
	意思是：
	@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
	
	1)	如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，
		配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
		例如：本来应该到success.jsp页面的，则其显示success.
	
	2)	如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
	
	3)	如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。
 */
@RestController
@RequestMapping(value = "simple/rest")
public class SimpleRestController {
	@Autowired
	private SimpleService simpleService;

	@RequestMapping("/test1")
	public Object home() {
		/**
		 * \ 反斜杠转义自定义Json
		 */
		return simpleService.selectUser("{\"name\":\"test\"}");

	}

	@RequestMapping("/test2")
	public int index() {
		return simpleService.JDK_1_8_ServiceMethodCanImplBySelf();
	}
}
