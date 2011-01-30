package org.stavros.faretra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stavros.faretra.document.FaretraDocument;


public class FaretraFactory {
	
	private final static Logger logger = LoggerFactory.getLogger(FaretraFactory.class);
	
	public static Faretra create(FaretraDocument fd) {
		Faretra f = new Faretra();
		return f;
	}
}
