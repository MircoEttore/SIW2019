package persistance.JDBC;

import model.Artista;
import model.Utente;
import persistance.DAOFactory;
import persistance.DatabaseManager;
import persistence.dao.ArtistaDao;
import persistence.dao.UtenteDao;

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
			
			String p;

			  Utente tryLogin= DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().findPrimaryKey("email", "password") ; 
			 
			  System.out.println(tryLogin.getEmail());
			  System.out.println(tryLogin.getPassword());

		//	Utente uu= new Utente("nome=?","cognome=?","nickname=?","email=?",false ,"password=?","indirizzo=?");
		//	UtenteDao udao=factory.getUtenteDAO();
		//	udao.save(uu);
		//	System.out.println(uu.getEmail());
		//Utente u=new Utente();
		//	u=udao.findPrimaryKey(uu.getEmail(), uu.getPassword());
		//	System.out.println(u.getEmail());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
