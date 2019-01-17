package model;



public class Ordine {

	private int idUtente;
	
    private double prezzoCorrente;
    
    
	private Carrello carrello;


	
	
	public Ordine(int idUtente, double prezzoCorrente, Carrello carrello) {
		super();
		this.idUtente = idUtente;
		this.prezzoCorrente = prezzoCorrente;
		this.carrello = carrello;
	}
	
	
	
	
	
	
	
	public int getIdUtente() {
		return idUtente;
	}


	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}


	public double getPrezzoCorrente() {
		return prezzoCorrente;
	}


	public void setPrezzoCorrente(double prezzoCorrente) {
		this.prezzoCorrente = prezzoCorrente;
	}


	public Carrello getCarrello() {
		return carrello;
	}


	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}



	
	
	
	
	
	
}
