package model;

public class Artista {
	
	private String nomeArtista;
	private int idArtista;

	public Artista () {
		super() ;
	}
	public Artista(String nomeArtista, int idArtista) {
		super();
		this.nomeArtista = nomeArtista;
		this.idArtista = idArtista;
	}
	public Artista(String nomeArtista) {
		super();
		this.nomeArtista = nomeArtista;
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


}
