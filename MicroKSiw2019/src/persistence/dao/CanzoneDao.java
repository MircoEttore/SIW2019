package persistence.dao;

import java.util.List;

import model.Canzone;


public interface CanzoneDao{	
	public void save(Canzone canzone);  // Create
//	public Canzone findByPrimaryKey(String matricola);     // Retrieve
	public List<Canzone> findAll();       
	public void update(Canzone canzone); //Update
	public void delete(Canzone canzone); //Delete	
	
	
}


