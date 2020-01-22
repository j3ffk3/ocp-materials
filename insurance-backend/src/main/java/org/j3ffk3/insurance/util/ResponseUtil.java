package org.j3ffk3.insurance.util;

import org.j3ffk3.insurance.bo.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

	private ResponseUtil() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * 產生統一回覆
	 * 
	 * @param data
	 * @return
	 */
	public static ResponseEntity<GenericResponse> genGenericResponse(Object data) {
		return new ResponseEntity<>(new GenericResponse(HttpStatus.OK.value(), HttpStatus.OK.name(), data),
				HttpStatus.OK);
	}
}
