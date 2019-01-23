package persistance;

import persistence.dao.ArtistaDao;
import persistence.dao.CanzoneDao;
import persistence.dao.CategorieDAO;
import persistence.dao.EventoDao;
import persistence.dao.UtenteDao;

public class PostgresDAOFactory extends DAOFactory {

	
	
	private static  DataSource dataSource;
	

	// --------------------------------------------

	static {
		try { 
			Class.forName("org.postgresql.Driver").newInstance();
			//questi vanno messi in file di configurazione!!!	
//			dataSource=new DataSource("jdbc:postgresql://52.39.164.176:5432/xx","xx","p@xx");
		//	dataSource=new DataSource("jdbc:postgresql://localhost:5432/Segreteria2019","postgres","postgres");
//			dataSource=new DataSource("jdbc:postgresql://localhost:5432/Database_MicroK","postgres","postgres");
			DataSource.getInstance() ;
			
		} 
		catch (Exception e) {
			System.err.println("PostgresDAOFactory.class: failed to load MySQL JDBC driver\n"+e);
			e.printStackTrace();
		}
	}

	
	// --------------------------------------------
	

	@Override
	public CanzoneDao getCanzoneDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArtistaDao getArtistaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventoDao getEventoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategorieDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UtenteDao getUtenteDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}
