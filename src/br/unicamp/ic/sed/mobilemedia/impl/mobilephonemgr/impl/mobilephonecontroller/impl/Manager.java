package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.impl;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.cosmos.AManager;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IAlbumCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IExceptionsHandlerCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IFilesystemCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IMobileResourcesCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IPhotoCtr;

class Manager extends AManager implements IManager{

	Hashtable providedInterfaces;
	Hashtable requiredInterfaces;

	static int counter = 0;
	
	Manager(){ //System.out.println("Manager.Manager()");
		
		
		providedInterfaces = new Hashtable();
		requiredInterfaces = new Hashtable();
		this.setProvidedInterface("IMobilePhoneCtr", new br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.impl.IMobilePhoneMgrFacade());
		this.setRequiredInterfaceType("IAlbumCtr", IAlbumCtr.class);
		this.setRequiredInterfaceType("IPhotoCtr", IPhotoCtr.class);
		this.setRequiredInterfaceType("IMobileResourcesCtr", IMobileResourcesCtr.class);
		this.setRequiredInterfaceType("IFilesystemCtr", IFilesystemCtr.class);
		this.setRequiredInterfaceType("IExceptionsHandlerCtr", IExceptionsHandlerCtr.class);
	}
	
	
	public String[] getProvidedInterfaces(){ //System.out.println("Manager.getProvidedInterfaces()");
	   Vector provInterfaceList = new Vector();
	   provInterfaceList.addElement("IMobilePhoneCtr");
	     
	   return convertListToArray(provInterfaceList.elements());
	}

	
	private String[] convertListToArray(Enumeration stringEnum){ //System.out.println("Manager.convertListToArray()");
		Vector stringVector = new Vector();
		for (Enumeration iter = stringEnum; iter.hasMoreElements();) {
			String element = (String) iter.nextElement();
			stringVector.addElement(element);
		}
		
		String[] stringArray = new String[stringVector.size()];
		for (int i=0; i < stringVector.size(); i++){
			stringArray[i] = (String) stringVector.elementAt(i);
		}
		return stringArray;
	}

	public Object getProvidedInterface(String name){ //System.out.println("Manager.getProvidedInterface()");
		return this.providedInterfaces.get(name);
	}
	
	public Object getRequiredInterface(String name){ //System.out.println("Manager.getRequiredInterface()");
		return this.requiredInterfaces.get(name);
	}

	public void setProvidedInterface(String name, Object facade){ //System.out.println("Manager.setProvidedInterface()");
		this.providedInterfaces.put(name, facade);
	}

	public void setRequiredInterface(String name,Object facade){ //System.out.println("Manager.setRequiredInterface()");
		if(name == null)
			System.err.println("name is null");
		if(facade == null)
			System.err.println("br.unicamp.ic.sed.mobilemedia.mobilephonemgr.mobilephonecontroller.impl.Manager facade is null");
		if(requiredInterfaces == null)
			System.err.println("requiredinterfaces is null");
		this.requiredInterfaces.put(name, facade);
	}
	
}



