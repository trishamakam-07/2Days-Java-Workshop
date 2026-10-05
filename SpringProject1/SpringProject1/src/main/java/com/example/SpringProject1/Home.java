package com.example.SpringProject1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	// @RequestMapping("/")
	@GetMapping("/home")
	private String bulid() {
		return "Hello from home page..";
	}
}
