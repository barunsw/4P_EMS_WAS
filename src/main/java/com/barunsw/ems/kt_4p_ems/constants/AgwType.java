package com.barunsw.ems.kt_4p_ems.constants;

public enum AgwType {
	PORT_4,
	PORT_8;
//	PORT_16,
//	PORT_32;
//	
	@Override
	public String toString() {
		switch(this) {
			case PORT_4:
				return "4P";
			case PORT_8:
				return "8P";
//			case PORT_16:
//				return "16P";
//			case PORT_32:
//				return "32P";
			default:
				return "";
		}
	}
	
	public static AgwType toAgwType(String agwTypeStr) {
		switch(agwTypeStr) {
			case "4P":
				return AgwType.PORT_4;
			case "8P":
				return AgwType.PORT_8;
			default:
				return AgwType.PORT_4;
 		}
	}
}
