package persistance.JDBC;

import model.Artista;
import persistance.DAOFactory;
import persistence.dao.ArtistaDao;

public class JDBCExample {
	public static void main(String args[]) {
		
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.POSTGRESQL); 
		try {

			Class.forName("org.postgresql.Driver");

			Artista s = new Artista() ; 
			s.setNomeArtista("suca mirco");
			ArtistaDao adao = factory.getArtistaDAO() ; 
			adao.save(s);
			
			System.out.println("ALL DONE");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
