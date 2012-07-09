package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req;


public interface IAlbumCtr{

	public void initAlbumListScreen ( String[] albumNames ); 
	public void initNewAlbumScreen (  );
	public void initDeleteAlbumScreen( String albumName );
	public String getSelectedAlbum (  ); 
	public String getNewAlbumName (  ); 
}