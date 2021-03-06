/*
 * Created on Sep 13, 2004
 *
 * Modified on Nov 24, 2008
 */

package br.unicamp.ic.sed.mobilemedia.impl.album.impl;

import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;


/**
 * @author trevor, ivo
 *
 * This screen displays a list of photo albums available to select.
 * A user can also create a new album on this screen.
 */
class AlbumListScreen extends List {

	public static final Command exitCommand = new Command("Exit", Command.STOP, 2);
	public static final Command selectCommand = new Command("Select", Command.ITEM, 1);
	public static final Command createAlbumCommand = new Command("New Photo Album", Command.ITEM, 1);
	public static final Command deleteAlbumCommand = new Command("Delete Album", Command.ITEM, 1);
	public static final Command resetCommand = new Command("Reset", Command.ITEM, 1);
	
	/**
	 * Constructor
	 */
	public AlbumListScreen() {
		super("Select Album", Choice.IMPLICIT);
		//System.out.println("AlbumListScreen.AlbumListScreen()");
	}


	/**
	 * Constructor
	 * @param arg0
	 * @param arg1
	 */
	public AlbumListScreen(String arg0, int arg1) {
		super(arg0, arg1);
		//System.out.println("AlbumListScreen.AlbumListScreen()");
	}

	/**
	 * Constructor
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public AlbumListScreen(String arg0, int arg1, String[] arg2, Image[] arg3) {
		super(arg0, arg1, arg2, arg3);
		//System.out.println("AlbumListScreen.AlbumListScreen()");
	}
	
	
	/**
	 * Initialize the menu items for this screen
	 * 
	 */
	public void initMenu() { //System.out.println("AlbumListScreen.initMenu()");
		this.addCommand(exitCommand);
		this.addCommand(selectCommand);
		this.addCommand(createAlbumCommand);
		this.addCommand(deleteAlbumCommand);
		this.addCommand(resetCommand);
	}
	public void deleteAll(){ //System.out.println("AlbumListScreen.deleteAll()");
		for (int i = 0; i < this.size(); i++) {
			this.delete(i);
		} 
	}
	public void repaintListAlbum(String[] names){ //System.out.println("AlbumListScreen.repaintListAlbum()");
		String[] albumNames = names;
	    this.deleteAll();
		for (int i = 0; i < albumNames.length; i++) {
			if (albumNames[i] != null) {
				//Add album name to menu list
				this.append(albumNames[i], null);
			}
		}
	}

}
