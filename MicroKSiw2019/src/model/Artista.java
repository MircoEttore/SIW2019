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
	public Artista(String nomeArtista) {
		super();
		this.nomeArtista = nomeArtista;
		this.idArtista = idArtista;
	}
	public void generaIdArtista() {
		int num =c.inserisciUnArtista(this) ;
		
		
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public int getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}

	public CatalogoMusicale getC() {
		return c;
	}

	public void setC(CatalogoMusicale c) {
		this.c = c;
	}
	
	

}
