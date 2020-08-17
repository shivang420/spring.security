package com.w3dev.interview.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UserController {

	@RequestMapping("/")
	public ResponseEntity<String> home(){
		return ResponseEntity.ok("Welcome To Shivang's interview");
	}
}
