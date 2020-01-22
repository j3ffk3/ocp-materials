package org.j3ffk3.insurance.bo;

public class GenericResponse {

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

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param message
	 * @param data
	 */
	public GenericResponse(int code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

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
