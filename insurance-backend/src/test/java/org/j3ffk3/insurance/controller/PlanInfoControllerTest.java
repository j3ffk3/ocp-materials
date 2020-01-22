package org.j3ffk3.insurance.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.j3ffk3.insurance.entity.PlanInfo;
import org.j3ffk3.insurance.repository.PlanInfoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PlanInfoController.class)
public class PlanInfoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PlanInfoRepository planInfoRepository;

	List<PlanInfo> infos = new ArrayList<>();

	@BeforeEach
	void initData() {
		PlanInfo info = new PlanInfo("planCode", "planName", "planType", "planDesc");
		infos.add(info);
	}

	@Test
	void findAllPlanInfoTest() throws Exception {
		when(planInfoRepository.findAll()).thenReturn(infos);
		this.mockMvc.perform(get("/plans")).andDo(print()).andExpect(status().isOk());

	}

	@Test
	void findPlanByIdTest() throws Exception {
		when(planInfoRepository.findById((long) 1)).thenReturn(infos.stream().findFirst());
		this.mockMvc.perform(get("/plan/1")).andDo(print()).andExpect(status().isOk());

	}
}
