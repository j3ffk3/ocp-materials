package com.example.demo.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostCommitController {

	public static int count = 0;

	@GetMapping(value = "/", produces = "application/json; charset=UTF-8")
	public String getCount() {

		return "You have built " + count + " times in OpenShift";
	}

	@PostMapping(value = "/")
	public String setCount() {
		count++;
		return "OK";
	}
}
