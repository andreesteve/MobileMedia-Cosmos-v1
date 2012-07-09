package br.unicamp.ic.sed.mobilemedia.impl;

import br.unicamp.ic.sed.cosmos.IManager;

public class ComponentFactory 
{
	public static IManager CreateInstance()
	{
		return new Manager();
	}
}
