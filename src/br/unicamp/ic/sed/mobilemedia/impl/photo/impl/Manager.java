package br.unicamp.ic.sed.mobilemedia.impl.photo.impl;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.photo.spec.req.IMobilePhone;
import br.unicamp.ic.sed.mobilemedia.impl.photo.spec.req.IMobileResources;

class Manager implements IManager{
	
	Hashtable reqInterfaceMap = new Hashtable();
	
	public Manager()
	{
		setProvidedInterface("IPhoto", new IPhotoFacade( ));
		
		setRequiredInterfaceType("IMobileResources", IMobileResources.class);
		setRequiredInterfaceType("IMobilePhone", IMobilePhone.class);
	}
	
	private void setRequiredInterfaceType(String string,
			Class<?> class1) {
		// TODO Auto-generated method stub
		
	}

	public String[] getProvidedInterfaces(){ //System.out.println("Manager.getProvidedInterfaces()");
		Vector provInterfaceList = new Vector();
		
	     
	   
	   return convertListToArray(provInterfaceList.elements());
	}
	
	private void setProvidedInterface(String string,
			Object iMobileResourcesAdapter) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getRequiredInterfaces(){ //System.out.println("Manager.getRequiredInterfaces()");
	
		return convertListToArray(reqInterfaceMap.keys());
	}
	
	public void init(){}
	
	public Object getProvidedInterface(String name){ //System.out.println("Manager.getProvidedInterface()");

	   if (name.equals("IPhoto")){
	   		return new IPhotoFacade( );
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
	public Map<String, Class<?>> getProvidedInterfaceTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<?>> getRequiredInterfaceTypes() {
		// TODO Auto-generated method stub
		return null;
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
}



