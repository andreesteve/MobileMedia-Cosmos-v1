package br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr.impl;

import java.util.*;

import br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr.spec.prov.*;

import br.unicamp.ic.sed.cosmos.IManager;

class Manager implements IManager{

	Hashtable reqInterfaceMap = new Hashtable();

	public Manager()
	{
		setProvidedInterface("IFilesystem", new IFilesystemFacade());
	}
	
	public String[] getProvidedInterfaces(){// System.out.println("Manager.getProvidedInterfaces()");
	   Vector provInterfaceList = new Vector();
	  	   
	     
	   
	   return convertListToArray(provInterfaceList.elements());
	}
	

	private void setProvidedInterface(String string, Object facade) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getRequiredInterfaces(){ //System.out.println("Manager.getRequiredInterfaces()");
	
		return convertListToArray(reqInterfaceMap.keys());
	}
	
	public Object getProvidedInterface(String name){ //System.out.println("Manager.getProvidedInterface()");

	   if (name.equals("IFilesystem")){
	   		return new IFilesystemFacade();
	   }
	   
	   return null;
	}
	
	public void setRequiredInterface(String name, Object facade){ //System.out.println("Manager.setRequiredInterface()");
		reqInterfaceMap.put(name,facade);
	}
	
	public Object getRequiredInterface(String name){ //System.out.println("Manager.getRequiredInterface()");
	   return reqInterfaceMap.get(name);
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

	@Override
	public String[] listProvidedInterfaceNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] listRequiredInterfaceNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<?>> getProvidedInterfaceTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<?>> getRequiredInterfaceTypes() {
		// TODO Auto-generated method stub
		return null;
	}
}



