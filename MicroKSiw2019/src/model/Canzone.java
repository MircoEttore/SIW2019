package model;

import java.util.Date;

public class Canzone {
	
	private int idCanzone;
	
	private Artista artista;

	private String titolo;
	private String album;
	private String genere;
	private String casaDiscografica;
    private IndiceDiGradimento indiceDiGradimento;
	private Integer anno;
	
	
	public Canzone() {
		artista=new Artista();
		indiceDiGradimento=new IndiceDiGradimento();
		album="";
		genere="";
		casaDiscografica="";
		anno=1900;
	}

	

	public Canzone(int idCanzone, Artista artista, String titolo, String album, String genere, String casaDiscografica,
			IndiceDiGradimento indiceDiGradimento, Integer anno) {
		super();
		this.idCanzone = idCanzone;
		this.artista = artista;
		this.titolo = titolo;
		this.album = album;
		this.genere = genere;
		this.casaDiscografica = casaDiscografica;
		this.indiceDiGradimento = indiceDiGradimento;
		this.anno = anno;
	}


	public int getIdCanzone() {
		return idCanzone;
	}


	public void setIdCanzone(int idCanzone) {
		this.idCanzone = idCanzone;
	}


	public Artista getArtista() {
		return artista;
	}


	public void setArtista(Artista artista) {
		this.artista = artista;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	public String getCasaDiscografica() {
		return casaDiscografica;
	}


	public void setCasaDiscografica(String casaDiscografica) {
		this.casaDiscografica = casaDiscografica;
	}


	public Integer getAnno() {
		return anno;
	}


	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
	


}
