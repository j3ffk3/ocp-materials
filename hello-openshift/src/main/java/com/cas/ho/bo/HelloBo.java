package com.cas.ho.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloBo {
	
	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 口頭禪
	 */
	private String signaturePhrase;
}
