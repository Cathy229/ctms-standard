package com.sinotrans.oms.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.oms.test.service.TestManager;

@RestController
public class MyController {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	@RequestMapping("/a")
	String a() {
		return "a!";
	}
	
	@Autowired
	private TestManager testManager;
	
	@RequestMapping("/get")
	String get() {
		return testManager.get().getBswhName();
	}
	
	@RequestMapping("/query")
	String query() {
		List<Map<String, Object>> list = testManager.query();
		StringBuilder sb = new StringBuilder();
		list.forEach((Map<String, Object> row)->{
			sb.append(row.get("bswhEnName"));
		});
		return sb.toString();
	}
}
