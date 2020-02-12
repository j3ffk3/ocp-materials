package org.j3ffk3.insurance.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.j3ffk3.insurance.repository.PlanInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ProbeController.class)
public class ProbeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PlanInfoRepository planInfoRepository;
	
	@Test
	void getSiteInfoTest() throws Exception {
		this.mockMvc.perform(get("/health")).andExpect(status().isOk());
	}

}
