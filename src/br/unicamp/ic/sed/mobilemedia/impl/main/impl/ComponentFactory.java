package br.unicamp.ic.sed.mobilemedia.impl.main.impl;

import br.unicamp.ic.sed.cosmos.IManager;

public class ComponentFactory 
{
	public static IManager createInstance()
	{
		return new Manager();
	}
}
