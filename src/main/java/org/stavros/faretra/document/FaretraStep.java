package org.stavros.faretra.document;

import java.awt.Dimension;
import java.util.List;

import org.jdom.Element;

public class FaretraStep {
	
	FaretraStep(Element element) throws FaretraXmlDocumentException {
		try {
			element.getAttributeValue(FaretraXmlConstants.STEP_ID.getValue());
		}
		catch(Exception e) {
			throw new FaretraXmlDocumentException();
		}
		try { 
			element.getAttributeValue(FaretraXmlConstants.STEP_NAME.getValue());
		}
		catch(Exception e) {
			throw new FaretraXmlDocumentException();
		}
		try {
			element.getAttributeValue(FaretraXmlConstants.STEP_CAPTION.getValue());
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
	
	private String caption;
	public final String getCaption() {
		return this.caption;
	}
	
	private Dimension dimension;
	public final Dimension getDimension() {
		return this.dimension;
	}
	
	private List<FaretraControl> faretraControls;
	public final List<FaretraControl> getFaretraControls() {
		return this.faretraControls;
	}
}
