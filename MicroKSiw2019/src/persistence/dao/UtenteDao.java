package persistence.dao;

import model.Utente;

public interface UtenteDao {
	public void save(Utente utente);  // Create
//	public Canzone findByPrimaryKey(String matricola);     // Retrieve
//	public List<Canzone> findAll();       
	public void update(Utente canzone); //Update
	public void delete(Utente canzone); //Delete	
}
