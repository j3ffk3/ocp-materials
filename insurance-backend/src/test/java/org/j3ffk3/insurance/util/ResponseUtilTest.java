package org.j3ffk3.insurance.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.j3ffk3.insurance.bo.GenericResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

public class ResponseUtilTest {

	@Test
	void genGenericResponseTest() {
		ResponseEntity<GenericResponse> response = ResponseUtil.genGenericResponse("Data");
		assertEquals("Data", response.getBody().getData());
		assertEquals(200, response.getBody().getCode());
		assertEquals("OK", response.getBody().getMessage());
	}
}
