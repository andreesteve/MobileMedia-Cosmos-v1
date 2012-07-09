package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.impl;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.impl.Manager;


import br.unicamp.ic.sed.cosmos.IManager;

public class ComponentFactory {

	private static IManager manager = null;
	
	public static IManager createInstance(){ //System.out.println("ComponentFactory.createInstance()");
	
		if (manager==null)
			manager = new Manager( );
		
		return manager;
	}
}



