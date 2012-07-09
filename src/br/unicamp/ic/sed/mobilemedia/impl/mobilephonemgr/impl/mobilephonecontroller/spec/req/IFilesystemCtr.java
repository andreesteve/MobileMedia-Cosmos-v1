package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req;
import javax.microedition.lcdui.Image;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.ImageNotFoundException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.InvalidImageDataException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.InvalidPhotoAlbumNameException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.PersistenceMechanismException;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.excep.UnavailablePhotoAlbumException;



public interface IFilesystemCtr{

	public String[] getImageNames ( String albumName ) throws UnavailablePhotoAlbumException; 
	public void addNewPhotoToAlbum ( String imageName, String imagePath, String albumName ) throws InvalidImageDataException, PersistenceMechanismException; 
	public void deleteImage ( String imageName, String albumName ) throws PersistenceMechanismException, ImageNotFoundException; 
	public Image getImageFromRecordStore ( String albumName, String imageName ) throws ImageNotFoundException, PersistenceMechanismException; 
	public String[] getAlbumNames (  ); 
	public void resetImageData (  ) throws PersistenceMechanismException; 
	public void createNewPhotoAlbum ( String albumName ) throws PersistenceMechanismException, InvalidPhotoAlbumNameException; 
	public void deletePhotoAlbum ( String albumName ) throws PersistenceMechanismException; 
}