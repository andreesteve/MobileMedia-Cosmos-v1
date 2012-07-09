package br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_album.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.mobilemedia.impl.album.spec.req.IMobileResources;
import br.unicamp.ic.sed.cosmos.IManager;

class IMobileResourcesAdapter implements IMobileResources{

	public MIDlet getMainMIDlet() { //System.out.println("IMobileResourcesAdapter.getMainMIDlet()");
		IManager manager = ComponentFactory.createInstance();
		br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources iMobileResources = (br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources)manager.getRequiredInterface("IMobileResources");
		return iMobileResources.getMainMIDlet();
	}	
}