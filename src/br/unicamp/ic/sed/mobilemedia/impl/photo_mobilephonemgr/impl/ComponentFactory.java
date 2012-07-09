package br.unicamp.ic.sed.mobilemedia.impl.photo_mobilephonemgr.impl;

import br.unicamp.ic.sed.cosmos.IManager;

public class ComponentFactory {

	private static IManager manager = null;
	
	public static IManager createInstance(){ //System.out.println("ComponentFactory.createInstance()");
	
		if (manager==null)
			manager = new Manager( );
		
		return manager;
	}
}


