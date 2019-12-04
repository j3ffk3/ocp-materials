package com.cas.ho.bo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GeneralResponse {
	
	/**
	 * 代碼
	 */
	private int code;
	
	/**
	 * 訊息
	 */
	private String message;
	
	/**
	 * 資料
	 */
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
