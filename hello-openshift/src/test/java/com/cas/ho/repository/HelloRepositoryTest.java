package com.cas.ho.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cas.ho.bo.HelloBo;

@SpringBootTest
public class HelloRepositoryTest {
	
	@Autowired
	HelloRepository helloRepository;
	
	@Test
	public void initDataTest() {
		helloRepository.initData();
	}
	
	@Test
	public void findHelloTest() {
		List<HelloBo> response =helloRepository.findHello();
		assertEquals("Jeff Ke1", response.get(0).getName(), "Incorrect data size");	
	}
}
