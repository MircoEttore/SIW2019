package persistence.dao;

import java.sql.SQLException;
import java.util.List;

import model.Artista;
import model.Canzone;

public interface ArtistaDao{	
	public void save(Artista artista) throws SQLException;  // Create
//	public Canzone findByPrimaryKey(String matricola);     // Retrieve
	public List<Artista> findAll();       
	public void update(Artista artista); //Update
	public void delete(Artista artista); //Delete	
	
	
}