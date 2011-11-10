package org.stavros.faretra.document;

public enum FaretraXmlConstants {
	WIZZARD("wizzard"),
	WIZZARD_NAME("name"),
	WIZZARD_ID("id"),
	WIZZARD_STEP("step"),
	STEP_ID("id"),
	STEP_NAME("name"),
	STEP_CAPTION("caption");
	
	private String value;
	public String getValue() {
		return this.value;
	}
	
	FaretraXmlConstants(String value) {
		this.value = value;
	}
}
