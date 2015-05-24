package org.stavros.faretra;

import java.awt.Frame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stavros.faretra.document.FaretraDocumentFactory;
import org.stavros.faretra.document.FaretraXmlDocumentException;
import org.stavros.faretra.document.model.FaretraDocument;

public class Faretra extends Frame {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Faretra.class);
	
	public static void main(String[] args) {
		String filename = "definition.xml";
		
		try {
			FaretraDocument fd = FaretraDocumentFactory.createFromXml(filename);
			LOGGER.info("Loaded the configuration file: "+filename);
			
			Faretra f = FaretraFactory.create(fd);
			
			f.addWindowListener(new FaretraWindowAdapter());
			
			f.setSize(640, 480);
			f.setVisible(true);
		}
		catch(FaretraXmlDocumentException fxde) {
			System.out.println(fxde.getMessage());
		}
	}
}
