package persistance.JDBC;

import java.util.Date;

import model.Artista;
import model.Canzone;
import model.Evento;
import model.IndiceDiGradimento;
import model.Utente;
import persistance.DataSource;

public class JDBCExample {
	public static void main(String args[]) {
		try {

			Class.forName("org.postgresql.Driver");
			DataSource.dataSource.getInstance() ; 
//			DataSource dataSource = new DataSource("jdbc:postgresql://192.168.43.197:5432/Database_MicroK", "postgres", "postgres");

			
			Artista artista = new Artista("System of a Down");
			ArtistaDaoJDBC a_jdbc = new ArtistaDaoJDBC(DataSource.dataSource.getInstance() );
			System.err.println(a_jdbc.findAll().get(6).getNomeArtista());
//			Evento evento = new Evento("Concerto primo maggio", "Palmi", new Date ()  , 10 ); 
			System.out.println("ALL DONE");
			
//			Date aDate = new Date();
//			aDate.setYear(1990);
//			aDate.setDate(01);
//			aDate.setMonth(05);
//			
//			System.out.println(aDate.getMonth());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
