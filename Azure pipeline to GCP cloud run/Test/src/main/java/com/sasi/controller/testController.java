package com.sasi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@GetMapping
	public String welcomeMessage() {
		return "hi there";
	}

}
