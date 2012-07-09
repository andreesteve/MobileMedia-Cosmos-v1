package br.unicamp.ic.sed.mobilemedia.impl.main.impl;

import br.unicamp.ic.sed.cosmos.AManager;
import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone;

class Manager extends AManager 
{
	public Manager()
	{
		setProvidedInterface("IMobileResources", new MainUIMidlet(this));		
	}
}
