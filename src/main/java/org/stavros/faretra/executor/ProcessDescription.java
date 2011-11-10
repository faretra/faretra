package org.stavros.faretra.executor;

import java.util.ArrayList;
import java.util.List;

public class ProcessDescription {
	
	public ProcessDescription() {
		this.parameters = new ArrayList<ProcessParameter>();
	}
	
	private String command;
	public void setCommand(String command) {
		this.command = command;
	}
	public String getCommand() {
		return this.command;
	}
	
	private List<ProcessParameter> parameters;
	public void setParameters(List<ProcessParameter> parameters) {
		this.parameters = parameters;
	}
	public List<ProcessParameter> getParameters() {
		return this.parameters;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.command);
		for (ProcessParameter pp: this.parameters) {
			sb.append(" ");
			sb.append(pp.toString());
		}
		
		return sb.toString();
	}
}
