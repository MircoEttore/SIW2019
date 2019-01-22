package persistance.JDBC;


import model.Artista;
import model.Canzone;
import model.IndiceDiGradimento;
import model.Utente;
import persistance.DataSource;

public class JDBCExample {
	public static void main(String args[]) {
		try {
			// PostgresDAOFactory p;
			// p=new PostgresDAOFactory();

			Class.forName("org.postgresql.Driver") ; 
//<<<<<<< HEAD
			DataSource dataSource = new DataSource("jdbc:postgresql://localhost:5432/Database_MicroK", "postgres","postgres");
	//		DataSource dataSource = new DataSource("jdbc:postgresql://192.168.1.6:5432/Database_MicroK", "postgres",
					//"postgres");
	
			
//=======
			//DataSource dataSource = new DataSource("jdbc:postgresql://localhost:5432/Database_MicroK", "postgres","postgres");
//			DataSource dataSource = new DataSource("jdbc:postgresql://192.168.1.6:5432/Database_MicroK", "postgres","postgres");
//>>>>>>> branch 'master' of https://github.com/MircoEttore/SIW2019
//			CanzoneDaoJDBC canzone = new CanzoneDaoJDBC(dataSource);
//			IndiceDiGradimento i = new IndiceDiGradimento(6);
//			int ii = i.getVotoAttuale();
//<<<<<<< HEAD
//			Artista a = new Artista("Led Zeppelin");
//			Canzone cc = new Canzone(a, "Stairway To Heaven", "Led Zeppelin I", "Heavy Rock", "-", i,
//					"notAvaible", 1974);ciuccia
//			System.err.println(cc);   
//			canzone.save(cc);   mmm
			
			

			
		//	ArtistaDaoJDBC artistaJDBC = new ArtistaDaoJDBC(dataSource) ; 
		///	Artista artista0 = new Artista("Bionda" , 13) ; 
		//	System.err.println(artistaJDBC);
		//	artistaJDBC.delete(artista0); 			


//=======
			//Artista a = new Artista("Led ");
			
			
			
			Utente u= new Utente("nome","cognome","nickname","email",false,"password","indirizzo");
			
			UtenteDaoJDBC a=new UtenteDaoJDBC(dataSource);
			System.out.println(a.findAll().get(1).getCognome());
			
			
			
			//Canzone cc = new Canzone(5,a, "Stairway To Heaven", "Led Zeppelin I", " Rock", "-", i,"notAvaible", 1974);
//Canzone cc= new Canzone(4);
		//	System.err.println(cc);
			
			//canzone.save(cc);
		//canzone.update(cc);
//		System.out.println(canzone.findAll().get(1).getTitolo());
	
		System.out.println("ALL DONE");
//>>>>>>> branch 'master' of https://github.com/MircoEttore/SIW2019
		} catch (Exception e) {
			// System.err.println("PostgresDAOFactory.class: failed to load MySQL JDBC
			// driver\n"+e);
			e.printStackTrace();
		}
	}
}
/*
 * public static void main(String[] argv) { IndiceDiGradimento i=new
 * IndiceDiGradimento(6); int ii =i.getVotoAttuale(); Artista a =new
 * Artista("moro"); Canzone cc=new Canzone(a," titdolo",
 * "album"," genere"," casaDiscografica",i," url",6654); PostgresDAOFactory p;
 * p=new PostgresDAOFactory(); DataSource dataSource=new
 * DataSource("jdbc:postgresql://localhost:5432/Database_MicroK","postgres",
 * "postgres"); CanzoneDaoJDBC c=new CanzoneDaoJDBC(dataSource); c.save(cc); } }
 */