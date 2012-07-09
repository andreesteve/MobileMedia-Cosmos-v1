package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.spec.req.IMobileResourcesWEH;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IMobileResources;

class IAdapterMobileResourcesWEH implements IMobileResourcesWEH {

	private Manager manager;
	
	public IAdapterMobileResourcesWEH(Manager mgr) {// System.out.println("IAdapterMobileResourcesWEH.IAdapterMobileResourcesWEH()");
		manager = mgr;
	}
	
	public MIDlet getMainMIDlet() { //System.out.println("IAdapterMobileResourcesWEH.getMainMIDlet()");
		IMobileResources mobResources = (IMobileResources) manager.getRequiredInterface("IMobileResources");
		return mobResources.getMainMIDlet();
	}

}
