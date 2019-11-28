package com.barunsw.ems.kt_4p_ems.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class PackageInfoVo {
	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
