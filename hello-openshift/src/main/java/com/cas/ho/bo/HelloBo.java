package com.cas.ho.bo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HelloBo {

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 口頭禪
	 */
	private String signaturePhrase;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSignaturePhrase() {
		return signaturePhrase;
	}

	public void setSignaturePhrase(String signaturePhrase) {
		this.signaturePhrase = signaturePhrase;
	}

}
