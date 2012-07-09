package br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_mobilephonemgr.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IMobileResources;

class IMobileResourcesAdapter implements IMobileResources{

	public MIDlet getMainMIDlet() { 
		IManager manager = ComponentFactory.createInstance();
		br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources iMobileResources = (br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources)manager.getRequiredInterface("IMobileResources");
		return iMobileResources.getMainMIDlet();
	}	
}