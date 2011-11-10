package org.stavros.faretra.document;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FaretraWizzard {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(FaretraWizzard.class);
	
	FaretraWizzard(Element element) throws FaretraXmlDocumentException {
		try {
			this.id = element.getAttributeValue(FaretraXmlConstants.WIZZARD_ID.getValue());
		}
		catch(Exception e) {
			throw new FaretraXmlDocumentException();
		}
		try {
			this.name = element.getAttributeValue(FaretraXmlConstants.WIZZARD_NAME.getValue());
		}
		catch(Exception e) {
			throw new FaretraXmlDocumentException();
		}
		try {
			this.faretraSteps = new ArrayList<FaretraStep>();
			List<?> children = element.getChildren(FaretraXmlConstants.WIZZARD_STEP.getValue());
			for (Object obj: children) {
				Element el = (Element)obj;
				this.faretraSteps.add(new FaretraStep(el));
			}
		}
		catch(Exception e) {
			throw new FaretraXmlDocumentException();
		}
	}
	
	private String id;
	public String getId() {
		return this.id;
	}
	
	private String name;
	public String getName() {
		return this.name;
	}
	
	private List<FaretraStep> faretraSteps;
	public final List<FaretraStep> getFaretraSteps() {
		return this.faretraSteps;
	}
}
