package com.cas.ho.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.cas.ho.bo.HelloBo;
import com.cas.ho.repository.HelloRepository;


@WebMvcTest(HelloController.class)
public class HelloControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private HelloRepository helloRepository;

	@Test
	public void getHelloTest() throws Exception {
		// Prepare Data.
		List<HelloBo> bos = new ArrayList<>();
		HelloBo bo=new HelloBo("test","signaturePhrase");
		bos.add(bo);
		// Run
		when(helloRepository.findHello()).thenReturn(bos);
		mockMvc.perform(get("/hello")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.data[0].name").value("test"))
				.andExpect(jsonPath("$.data[0].signaturePhrase").value("signaturePhrase"));
	}
}
