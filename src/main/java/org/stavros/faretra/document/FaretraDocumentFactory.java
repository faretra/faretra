package org.stavros.faretra.document;

import java.io.FileInputStream;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FaretraDocumentFactory {
	
	private final static Logger logger = LoggerFactory.getLogger(FaretraDocumentFactory.class);
	
	public static FaretraDocument createFromXml(String filename) throws FaretraXmlDocumentException {
		SAXBuilder builder = new SAXBuilder();
		
		try {
			FileInputStream in = new FileInputStream(filename);
			Document document = builder.build(in);
			
			return createFromDocument(document);
		}
		catch(IOException ioe) {
			logger.error(ioe.getMessage(), ioe);
		}
		catch(JDOMException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
	
	public static FaretraDocument createFromDocument(Document dom) throws FaretraXmlDocumentException {
		FaretraDocument fd = new FaretraDocument(dom.getRootElement());
		return fd;
	}
}
