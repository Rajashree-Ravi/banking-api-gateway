package com.banking.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class ZuulProxyController {

	@GetMapping
	private ResponseEntity<String> getAllInventory() {
		return new ResponseEntity<>("Welcome to Online Banking System !!", HttpStatus.OK);
	}

}
