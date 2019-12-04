package com.cas.ho.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
}
