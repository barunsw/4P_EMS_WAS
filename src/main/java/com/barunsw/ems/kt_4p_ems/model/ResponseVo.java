package com.barunsw.ems.kt_4p_ems.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.barunsw.ems.kt_4p_ems.constants.Result;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties({"status"})
public class ResponseVo {
	/**
	 * HTTP Status
	 */
	private HttpStatus status = HttpStatus.OK;
	
	/**
	 * 결과
	 */
	private Result result;
	
	/**
	 * 사유
	 */
	private String message;

	/**
	 * 결과 data
	 */
	private Object data;
	
	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(final Object data) {
		this.data = data;
	}
	
	public ResponseEntity<ResponseVo> build() {
		return new ResponseEntity<ResponseVo>(this, status);
	}
}
