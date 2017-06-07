package com.boot.base.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式的使用
 * JDK必须在1.8以上
 * @author Curio
 *
 */
public class SimpleLambdaController {
	
	/**
	 * 
	 * 可参考  http://www.importnew.com/15259.html
	 * @param args
	 */

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 566, 7 });
		// 打印每个元素
		list.forEach(System.out::println);
		
		System.out.println("==================开始排序====================");
		// 排序
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer h1, Integer h2) {
				return h1.compareTo(h2);
			}
		});
		list.forEach(n -> System.out.println(n));
		System.out.println("==================开始排序2====================");
		
		list.sort((Integer a,Integer b) -> b.compareTo(a));
		list.forEach(System.out::println);
	}
}
