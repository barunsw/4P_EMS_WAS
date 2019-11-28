package com.barunsw.ems.kt_4p_ems.model;

import com.barunsw.ems.kt_4p_ems.constants.AgwType;
import com.barunsw.ems.kt_4p_ems.constants.RegisterType;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SetupFileInfoVo {

	private String macAddress;
	private RegisterType registerType;
	private AgwType agwType;
	private String cgwIp;

	private String oltIp;
	private String oltSubnet;
	private String oltGw;
	private String ipsecIp;
	private String agwIp;
	private String mgcIp;
	private String emsIp;

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public RegisterType getRegisterType() {
		return registerType;
	}

	public void setRegisterType(RegisterType registerType) {
		this.registerType = registerType;
	}

	public AgwType getAgwType() {
		return agwType;
	}

	public void setAgwType(AgwType agwType) {
		this.agwType = agwType;
	}

	public String getCgwIp() {
		return cgwIp;
	}

	public void setCgwIp(String cgwIp) {
		this.cgwIp = cgwIp;
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

	public String getIpsecIp() {
		return ipsecIp;
	}

	public void setIpsecIp(String ipsecGw) {
		this.ipsecIp = ipsecIp;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
