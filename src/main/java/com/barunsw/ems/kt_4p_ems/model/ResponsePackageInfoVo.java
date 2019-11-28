package com.barunsw.ems.kt_4p_ems.model;

import com.barunsw.ems.kt_4p_ems.constants.Result;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties({"status"})
public class ResponsePackageInfoVo {
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
	private String data;

	
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ResponseEntity<ResponsePackageInfoVo> build() {
		return new ResponseEntity<ResponsePackageInfoVo>(this, status);
	}
}
