package br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr_mobilephonemgr.impl;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr.spec.prov.IFilesystem;

class Manager implements IManager{

	Hashtable requiredInterfaces;
	Hashtable providedInterfaces;
 
	public Manager() { //System.out.println("Manager.Manager()");
		requiredInterfaces = new Hashtable();
		providedInterfaces = new Hashtable();
		setProvidedInterface("IFilesystem",new IFileSystemAdapter(this));
		setRequiredInterfaceType("IFilesystem", IFilesystem.class);
	}
	
	private void setRequiredInterfaceType(String string, Class<?> class1) {
		// TODO Auto-generated method stub
		
	}
	
	private void setProvidedInterface(String string, Object facade) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getProvidedInterfaces(){ //System.out.println("Manager.getProvidedInterfaces()");
	   Vector provInterfaceList = new Vector();
	  provInterfaceList.addElement("IFilesystem");
	     
	   
	   return convertListToArray(provInterfaceList.elements());
	}
	
	public String[] getRequiredInterfaces(){ //System.out.println("Manager.getRequiredInterfaces()");
	
		return convertListToArray(requiredInterfaces.keys());
	}
	
	public Object getProvidedInterface(String name){
//System.out.println("Manager.getProvidedInterface()");
	    
	   return this.providedInterfaces.get(name);
	}
	
	public void setRequiredInterface(String name, Object adapter){ //System.out.println("Manager.setRequiredInterface()");
		this.requiredInterfaces.put(name,adapter);
	}
	
	public Object getRequiredInterface(String name){ //System.out.println("Manager.getRequiredInterface()");
	   return requiredInterfaces.get(name);
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



