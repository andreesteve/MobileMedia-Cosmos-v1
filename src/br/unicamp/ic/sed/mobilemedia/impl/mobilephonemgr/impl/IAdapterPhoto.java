package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;

import javax.microedition.lcdui.Image;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IPhotoCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IPhoto;
import br.unicamp.ic.sed.cosmos.IManager;

class IAdapterPhoto implements IPhotoCtr {

	
	
	
	public String getAddedPhotoName() { //System.out.println("IAdapterPhoto.getAddedPhotoName()");
		IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getAddedPhotoName();
	}

	
	public String getAddedPhotoPath() { //System.out.println("IAdapterPhoto.getAddedPhotoPath()");
		IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getAddedPhotoPath();
	}

	
	public String getSelectedPhoto() { //System.out.println("IAdapterPhoto.getSelectedPhoto()");
		IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getSelectedPhoto();
	}

	
	public void initAddPhotoToAlbum(String albumName) { //System.out.println("IAdapterPhoto.initAddPhotoToAlbum()");
		IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initAddPhotoToAlbum(albumName);

	}

	
	public void initPhotoListScreen(String[] imageNames) { //System.out.println("IAdapterPhoto.initPhotoListScreen()");
		IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initPhotoListScreen(imageNames);
	}

	
	public void initPhotoViewScreen(Image image) { //System.out.println("IAdapterPhoto.initPhotoViewScreen()");
		IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initPhotoViewScreen(image);

	}

}
