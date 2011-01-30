package org.stavros.faretra;

import java.awt.Frame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stavros.faretra.document.FaretraDocument;
import org.stavros.faretra.document.FaretraDocumentFactory;

public class Faretra extends Frame {
	
	private final static Logger logger = LoggerFactory.getLogger(Faretra.class);
	
	public static void main(String[] args) {
		String filename = "definition.xml";
		
		FaretraDocument fd = FaretraDocumentFactory.createFromXml(filename);
		logger.info("Loaded the configuration file: "+filename);
		
		Faretra f = FaretraFactory.create(fd);
		
		f.addWindowListener(new FaretraWindowAdapter());
		
		f.setSize(640, 480);
		f.setVisible(true);
	}
}
