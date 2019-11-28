package com.barunsw.ems.kt_4p_ems.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.barunsw.ems.kt_4p_ems.constants.Result;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties({"status"})
public class ResponseSetupFileInfoVo {
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
	private String oltIp;
	private String oltSubnet;
	private String oltGw;
	private String ipsecGw;
	private String agwIp;
	private String mgcIp;
	private String emsIp;
	
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

	public String getOltIp() {
		return oltIp;
	}

	public void setOltIp(String oltIp) {
		this.oltIp = oltIp;
	}

	public String getOltSubnet() {
		return oltSubnet;
	}

	public void setOltSubnet(String oltSubnet) {
		this.oltSubnet = oltSubnet;
	}

	public String getOltGw() {
		return oltGw;
	}

	public void setOltGw(String oltGw) {
		this.oltGw = oltGw;
	}

	public String getIpsecGw() {
		return ipsecGw;
	}

	public void setIpsecGw(String ipsecGw) {
		this.ipsecGw = ipsecGw;
	}

	public String getAgwIp() {
		return agwIp;
	}

	public void setAgwIp(String agwIp) {
		this.agwIp = agwIp;
	}

	public String getMgcIp() {
		return mgcIp;
	}

	public void setMgcIp(String mgcIp) {
		this.mgcIp = mgcIp;
	}

	public String getEmsIp() {
		return emsIp;
	}

	public void setEmsIp(String emsIp) {
		this.emsIp = emsIp;
	}

	public ResponseEntity<ResponseSetupFileInfoVo> build() {
		return new ResponseEntity<ResponseSetupFileInfoVo>(this, status);
	}
}
