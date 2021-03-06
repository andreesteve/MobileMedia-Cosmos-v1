   
package br.unicamp.ic.sed.mobilemedia.impl.album.impl;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;

import br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum;


class IAlbumFacade implements IAlbum{
	
	private AlbumListScreen albumListScreen;
	private InternalAlbumController control;
	private NewAlbumScreen canv;
	
	public void initAlbumListScreen ( String[] albumNames ){ //System.out.println("IAlbumFacade.initAlbumListScreen()");
		//initialize all the screens
		albumListScreen = new AlbumListScreen();
		
		for (int i = 0; i < albumNames.length; i++) {
			if (albumNames[i] != null) {
				//Add album name to menu list
				albumListScreen.append(albumNames[i], null);
			}
		}
		
		albumListScreen.initMenu();
		control = new InternalAlbumController( );
		albumListScreen.setCommandListener(control);
		
		//Set the current screen to the photo album listing
		control.setCurrentScreen(albumListScreen);
	} 
	
	public void initNewAlbumScreen (  ){ //System.out.println("IAlbumFacade.initNewAlbumScreen()");
		canv = new NewAlbumScreen("Add new Photo Album");
		canv.setCommandListener(control);
		control.setCurrentScreen(canv);
	}
	
	public String getSelectedAlbum (  ){ //System.out.println("IAlbumFacade.getSelectedAlbum()");
		return albumListScreen.getString(albumListScreen.getSelectedIndex());
	} 
	
	public String getNewAlbumName (  ){ //System.out.println("IAlbumFacade.getNewAlbumName()");
		return canv.getAlbumName();
		
	}

	public void initDeleteAlbumScreen(String currentStoreName) { //System.out.println("IAlbumFacade.initDeleteAlbumScreen()");
		Alert deleteConfAlert = new Alert("Delete Photo Album", "Would you like to remove the album "+currentStoreName,null,AlertType.CONFIRMATION);
		deleteConfAlert.setTimeout(Alert.FOREVER);
		deleteConfAlert.addCommand(new Command("Yes - Delete", Command.OK, 2));
		deleteConfAlert.addCommand(new Command("No - Delete", Command.CANCEL, 2));
		control.setCurrentScreen(deleteConfAlert, albumListScreen);
		deleteConfAlert.setCommandListener(control);
	}
}