package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IMobileResourcesCtr;
import br.unicamp.ic.sed.cosmos.IManager;

class IAdapterMobileResources implements IMobileResourcesCtr {
		
	public MIDlet getMainMIDlet() { //System.out.println("IAdapterMobileResources.getMainMIDlet()");
		IManager mgr = ComponentFactory.createInstance();
		br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IMobileResources mobResources = (br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IMobileResources) mgr.getRequiredInterface("IMobileResources");
		return mobResources.getMainMIDlet();
	}

}
