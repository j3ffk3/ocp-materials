package org.j3ffk3.insurance.controller;

import org.j3ffk3.insurance.bo.GenericResponse;
import org.j3ffk3.insurance.repository.PlanInfoRepository;
import org.j3ffk3.insurance.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanInfoController {

	@Autowired
	PlanInfoRepository planInfoRepository;

	/**
	 * 查詢所有保障
	 * @return
	 */
	@GetMapping(value = "/plans", produces = "application/json; charset=UTF-8")
	public ResponseEntity<GenericResponse> findAllPlanInfo() {
		return ResponseUtil.genGenericResponse(planInfoRepository.findAll());
	}

	/**
	 * 依照ID 查詢保障
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/plan/{id}", produces = "application/json; charset=UTF-8")
	public ResponseEntity<GenericResponse> findPlanById(@PathVariable(value = "id") String id) {
		return ResponseUtil.genGenericResponse(planInfoRepository.findById(Long.valueOf(id)));
	}
}
