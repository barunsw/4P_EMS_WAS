package com.barunsw.ems.kt_4p_ems.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class PackageVo {
	private String seqNum;
	private String macAddress;
	private String data;
	
	public String getSeqNum() {
		return seqNum;
	}
	
	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
