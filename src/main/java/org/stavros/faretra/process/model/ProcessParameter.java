package org.stavros.faretra.process.model;

import java.util.ArrayList;
import java.util.List;

public class ProcessParameter {
	
	public ProcessParameter() {
		this.values = new ArrayList<ProcessParameter>();
	}
	
	private String prefix;
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getPrefix() {
		return this.prefix;
	}
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	private String nameValueSeparator;
	public void setNameValueSeparator(String nameValueSeparator) {
		this.nameValueSeparator = nameValueSeparator;
	}
	public String getNameValueSeparator() {
		return this.nameValueSeparator;
	}
	
	private List<ProcessParameter> values;
	public void setValues(List<ProcessParameter> values) {
		this.values = values;
	}
	public List<ProcessParameter> getValues() {
		return this.values;
	}
	
	private String multipleValuesSeparator;
	public void setMultipleValuesSeparator(String multipleValuesSeparator) {
		this.multipleValuesSeparator = multipleValuesSeparator;
	}
	public String getMultipleValuesSeparator() {
		return this.multipleValuesSeparator;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if (prefix != null) {
			sb.append(this.prefix);
		}
		if (name != null) {
			sb.append(this.name);
		}
		if (nameValueSeparator != null) {
			sb.append(this.nameValueSeparator);
		}
		for (ProcessParameter pp: this.values) {
			sb.append(pp.toString());
			sb.append(multipleValuesSeparator);
		}
		
		if (this.values.size() > 0) {
			sb.substring(0,sb.length()-this.multipleValuesSeparator.length());
		}
		
		return sb.toString();
	}
}
