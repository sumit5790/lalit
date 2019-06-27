package com.example.demo.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/demo")
public class MainController {
	
	
	@GetMapping("/xyz")
	public @ResponseBody Map<Integer, String> xyzMethod(){
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "A");
		map.put(1002, "B");
		map.put(1003, "C");
		map.put(1004, "D");
		
		return map;
	}
	
}
