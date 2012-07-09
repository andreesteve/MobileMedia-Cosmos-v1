package br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov;


public interface IAlbum{

	public void initAlbumListScreen ( String[] albumNames ); 
	public void initNewAlbumScreen (  ); 
	public String getSelectedAlbum (  ); 
	public String getNewAlbumName (  ); 
	public void initDeleteAlbumScreen( String currentStoreName );
}