package org.stavros.faretra;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FaretraWindowAdapter implements WindowListener {

	private final static Logger logger = LoggerFactory.getLogger(FaretraWindowAdapter.class);
	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
