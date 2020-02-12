package org.j3ffk3.insurance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProbeController {
	
	@GetMapping(value = "/health")
	public String getSiteInfo() {
		log.info("=================> API is healthy...");
		return "OK";
	}
}
