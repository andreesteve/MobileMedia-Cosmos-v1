package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;

import javax.microedition.lcdui.Image;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IFilesystemCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.ImageNotFoundException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.InvalidImageDataException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.InvalidPhotoAlbumNameException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.PersistenceMechanismException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.UnavailablePhotoAlbumException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IFilesystem;
import br.unicamp.ic.sed.cosmos.IManager;


class IAdapterFilesystem implements IFilesystemCtr {

	
	
	
	
	
	public void addNewPhotoToAlbum(String imageName, String imagePath,
			String albumName) throws InvalidImageDataException,
			PersistenceMechanismException {
//System.out.println("IAdapterFilesystem.addNewPhotoToAlbum()");		
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		filesystem.addNewPhotoToAlbum(imageName, imagePath, albumName);
		
		
	}


	public void createNewPhotoAlbum(String albumName)
			throws PersistenceMechanismException,
			InvalidPhotoAlbumNameException {
//System.out.println("IAdapterFilesystem.createNewPhotoAlbum()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		filesystem.createNewPhotoAlbum(albumName);

	}


	public void deleteImage(String imageName, String albumName)
			throws PersistenceMechanismException, ImageNotFoundException {
//System.out.println("IAdapterFilesystem.deleteImage()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		filesystem.deleteImage(imageName, albumName);
	}


	public void deletePhotoAlbum(String albumName)
			throws PersistenceMechanismException {
//System.out.println("IAdapterFilesystem.deletePhotoAlbum()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		filesystem.deletePhotoAlbum(albumName);

	}

	
	public String[] getAlbumNames() { //System.out.println("IAdapterFilesystem.getAlbumNames()");
		//System.out.println("entrou em IAdapterFilesystem.getAlbumNames()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		if(filesystem == null)
			System.err.println("(IAdapterFilesystem) filesystem is null");
		return  filesystem.getAlbumNames();
		
		
	}

	
	public Image getImageFromRecordStore(String albumName, String imageName)
			throws ImageNotFoundException, PersistenceMechanismException {
//System.out.println("IAdapterFilesystem.getImageFromRecordStore()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		return filesystem.getImageFromRecordStore(albumName, imageName);
	}

	
	public String[] getImageNames(String albumName)
			throws UnavailablePhotoAlbumException {
//System.out.println("IAdapterFilesystem.getImageNames()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		return filesystem.getImageNames(albumName);
	}


	public void resetImageData() throws PersistenceMechanismException {
//System.out.println("IAdapterFilesystem.resetImageData()");
		IManager mgr = ComponentFactory.createInstance();
		IFilesystem filesystem = (IFilesystem) mgr.getRequiredInterface("IFilesystem");
		filesystem.resetImageData();

	}

}
