package model;

import java.util.ArrayList;

public class Carrello {
	private int idCanzone;
	private int idUtente;

	private ArrayList<Integer>canzoniCarrello;
	
	
	public Carrello() {
		super();
	}
	
	
	public Carrello(ArrayList<Integer> canzoniCarrello) {
		super();
		this.canzoniCarrello = canzoniCarrello;
	}

	public int getId() {
		return idCanzone;
	}

	public void setId(int id) {
		this.idCanzone = id;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int userId) {
		this.idUtente = userId;
	}

	public ArrayList<Integer> getCanzoniCarrello() {
		return canzoniCarrello;
	}

	public void setCanzoniCarrello(ArrayList<Integer> canzoniCarrello) {
		this.canzoniCarrello = canzoniCarrello;
	}

	public void addItem(int itemId) {
		this.canzoniCarrello.add(itemId);
	}

	public int getId(int index) {
		return this.canzoniCarrello.get(index);
	}

	
}







	
