package com.boot.base.service;

public interface SimpleService {

	Object selectUser(Object object);

	/**
	 * 顺便说一下，在jdk 1.8 中 ，interface中的方法定义如果加了default修饰
	 * 是可以自己实现自己的
	 * 注意这点，避免以后在回答接口的概念的时候出错
	 * 在实现类中，可以不用再次实现
	 */
	default int JDK_1_8_ServiceMethodCanImplBySelf() {
		return 1;
	}
}
