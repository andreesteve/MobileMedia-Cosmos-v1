package br.unicamp.ic.sed.mobilemedia.impl;

import br.unicamp.ic.sed.cosmos.AManager;
import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone;

class Manager extends AManager 
{
	public Manager()
	{		
		// create all imanagers
		IManager filesystem = br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr.impl.ComponentFactory.createInstance();
		IManager album_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.album_mobilephonemgr.impl.ComponentFactory.createInstance();
		IManager mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.ComponentFactory.createInstance();
		IManager mainUI = br.unicamp.ic.sed.mobilemedia.impl.main.impl.ComponentFactory.createInstance();
		
		IManager filesystem_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr_mobilephonemgr.impl.ComponentFactory.createInstance();
		IManager album = br.unicamp.ic.sed.mobilemedia.impl.album.impl.ComponentFactory.createInstance();
		IManager mainMidlet_album = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_album.impl.ComponentFactory.createInstance();
		
		IManager photo = br.unicamp.ic.sed.mobilemedia.impl.photo.impl.ComponentFactory.createInstance();
		
		IManager photo_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.photo_mobilephonemgr.impl.ComponentFactory.createInstance();
		IManager mainMidlet_photo = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_photo.impl.ComponentFactory.createInstance();
		
		IManager mainmidlet_mobilephone = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_mobilephonemgr.impl.ComponentFactory.createInstance();
		
		
		filesystem_mobilePhone.setRequiredInterface("IFilesystem", filesystem.getProvidedInterface("IFilesystem"));

		mobilePhone.setRequiredInterface("IFilesystem", filesystem_mobilePhone.getProvidedInterface("IFilesystem"));
			
		mobilePhone.setRequiredInterface("IPhoto", photo_mobilePhone.getProvidedInterface("IPhoto"));
		
		album_mobilePhone.setRequiredInterface("IAlbum", album.getProvidedInterface("IAlbum"));
	
		album_mobilePhone.setRequiredInterface("IMobilePhone", mobilePhone.getProvidedInterface("IMobilePhone"));

		album.setRequiredInterface("IMobilePhone", album_mobilePhone.getProvidedInterface("IMobilePhone"));
		
		mainMidlet_album.setRequiredInterface("IMobileResources", mainUI.getProvidedInterface("IMobileResources") );

		album.setRequiredInterface("IMobileResources", mainMidlet_album.getProvidedInterface("IMobileResources") );
		
		photo_mobilePhone.setRequiredInterface("IPhoto", photo.getProvidedInterface("IPhoto"));
						
		photo_mobilePhone.setRequiredInterface("IMobilePhone", mobilePhone.getProvidedInterface("IMobilePhone"));

		photo.setRequiredInterface("IMobilePhone", photo_mobilePhone.getProvidedInterface("IMobilePhone"));
		
		photo.setRequiredInterface("IMobileResources", mainMidlet_photo.getProvidedInterface("IMobileResources") );
		
		mainMidlet_photo.setRequiredInterface("IMobileResources", mainUI.getProvidedInterface("IMobileResources") );
		
		
		mobilePhone.setRequiredInterface("IMobileResources", mainmidlet_mobilephone.getProvidedInterface("IMobileResources") );
		mainmidlet_mobilephone.setRequiredInterface("IMobileResources", mainUI.getProvidedInterface("IMobileResources") );
				
		mobilePhone.setRequiredInterface("IAlbum", album_mobilePhone.getProvidedInterface("IAlbum"));
		
		IMobilePhone mobPhone = (IMobilePhone) mobilePhone.getProvidedInterface("IMobilePhone");
		
	}
}
