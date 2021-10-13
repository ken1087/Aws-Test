package com.kang.test.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public ResponseEntity<?> findAll() {
		String test = "Do you build a SnowMan?";
		return new ResponseEntity<String>(test, HttpStatus.OK);
	}

            @GetMapping("/helloWorld")
	public ResponseEntity<?> testMethod() {
		String test = "Do you build a SnowMan?";
		return new ResponseEntity<String>(test, HttpStatus.OK);
	}
}
