package org.stavros.faretra.document.model;

import org.jdom.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stavros.faretra.document.FaretraXmlDocumentException;

public class FaretraDocument {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(FaretraDocument.class);
	
	public FaretraDocument(Element element) throws FaretraXmlDocumentException {
		this.faretraWizzard = new FaretraWizzard(element);
	}
	
	private FaretraWizzard faretraWizzard;
	public final FaretraWizzard getFaretraWizzard() {
		return this.faretraWizzard;
	}

}
