package persistence.dao;

import java.util.List;

import model.Utente;
import persistance.UtenteCredenziali;

public interface UtenteDao {
	public void save(Utente utente);  // Create
	public List<Utente> findAll();       
	public void update(Utente canzone); //Update
	public void delete(Utente canzone); //Delete	
	public Utente findPrimaryKey(String email, String password) ;
	UtenteCredenziali findByPrimaryKeyCredential(String email);
	Utente findByPrimaryKey1(String email); 
}
