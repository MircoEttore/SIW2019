package persistance.JDBC;

import persistance.DAOFactory;

public class JDBCExample {
	public static void main(String args[]) {
		
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.POSTGRESQL); 
		try {

			Class.forName("org.postgresql.Driver");

//			Artista s = new Artista() ; 
//			s.setNomeArtista("suca mirco");
//			ArtistaDao adao = factory.getArtistaDAO() ; 
//			adao.save(s);
			
			System.out.println("ALL DONE");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
