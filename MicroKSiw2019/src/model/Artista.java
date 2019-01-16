package model;

public class Artista {
	
	private String nomeArtista;
	private int idArtista;
	CatalogoMusicale c;
	
	public Artista() {
		super();
	}

	public Artista(String nomeArtista, int idArtista) {
		super();
		this.nomeArtista = nomeArtista;
		this.idArtista = idArtista;
	}

	public void generaIdArtista() {
		int num =c.inserisciUnArtista(this) ;
		
		
	}
	
	

}
