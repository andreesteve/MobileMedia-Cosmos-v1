package br.unicamp.ic.sed.mobilemedia.impl.main.impl;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone;


//Following are pre-processor statements to include the required
//classes for device specific features. They must be commented out
//if they aren't used, otherwise it will throw exceptions trying to
//load classes that aren't available for a given platform.


/* 
 * @author trevor
 *
 * This is the main Midlet class for the core J2ME application
 * It contains all the basic functionality that should be executable
 * in any standard J2ME device that supports MIDP 1.0 or higher. 
 * Any additional J2ME features for this application that are dependent
 * upon a particular device (ie. optional or proprietary library) are
 * de-coupled from the core application so they can be conditionally included
 * depending on the target platform 
 * 
 * This Application provides a basic Photo Album interface that allows a user to view
 * images on their mobile device. 
 * */
class MainUIMidlet extends MIDlet implements IMobileResources {

	private Manager mgr;
	
	public MainUIMidlet(Manager mgr) { //System.out.println("MainUIMidlet.MainUIMidlet()");
	    this.mgr = mgr;
	}

	/**
	 * Start the MIDlet by creating new model and controller classes, and
	 * initialize them as necessary
	 */
	public void startApp() throws MIDletStateChangeException { System.out.println("MainUIMidlet.startApp()");
		
		IMobilePhone mobPhone = (IMobilePhone) mgr.getProvidedInterface("IMobilePhone");
		
		
		
		mobPhone.startUp();
	}

	/**
	 * Pause the MIDlet
	 * This method does nothing at the moment.
	 */
	public void pauseApp() { //System.out.println("MainUIMidlet.pauseApp()");
		//do nothing
	}

	/**
	 * Destroy the MIDlet
	 */
	public void destroyApp(boolean unconditional) { //System.out.println("MainUIMidlet.destroyApp()");
		notifyDestroyed();
	}

	public MIDlet getMainMIDlet() { //System.out.println("MainUIMidlet.getMainMIDlet()");
		return this;
	}
}