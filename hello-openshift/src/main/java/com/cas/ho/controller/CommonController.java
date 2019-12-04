package com.cas.ho.controller;

import org.springframework.http.HttpStatus;

import com.cas.ho.bo.GeneralResponse;

public abstract class CommonController {
	/**
	 * 產生統一回覆
	 * @param data
	 * @return
	 */
	GeneralResponse genGeneralResponse(Object data) {
		return new GeneralResponse(HttpStatus.OK.value(), HttpStatus.OK.name(), data);
	}
}
