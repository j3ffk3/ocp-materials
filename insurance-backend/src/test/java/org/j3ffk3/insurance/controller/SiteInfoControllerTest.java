package org.j3ffk3.insurance.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.j3ffk3.insurance.repository.PlanInfoRepository;
import org.j3ffk3.insurance.service.SiteInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SiteInfoController.class)
public class SiteInfoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SiteInfoService siteInfoService;

	@MockBean
	private PlanInfoRepository planInfoRepository;

	@Test
	void getSiteInfoTest() throws Exception {
		when(siteInfoService.generateSiteInfo()).thenReturn("Testing...");
		this.mockMvc.perform(get("/api-info")).andExpect(status().isOk());
	}
}
