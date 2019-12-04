package com.cas.ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cas.ho.bo.GeneralResponse;
import com.cas.ho.repository.HelloRepository;

@RestController
@RequestMapping(path = "/")
public class HelloController extends CommonController {

	@Autowired
	HelloRepository helloRepository;
	
	/**
	 * 取得大家說Hello的口頭禪吧!
	 * @return
	 */
	@GetMapping(value = "/hello", produces = "application/json; charset=UTF-8")
	public ResponseEntity<GeneralResponse> getHello() {
		return new ResponseEntity<>(genGeneralResponse(helloRepository.findHello()), HttpStatus.OK);
	}
	
}
