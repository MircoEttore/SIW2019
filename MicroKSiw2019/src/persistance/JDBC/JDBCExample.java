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
			DataSource dataSource = new DataSource("jdbc:postgresql://192.168.43.197:5432/Database_MicroK", "postgres","postgres");
			Artista artista = new Artista("System of a Down");
			ArtistaDaoJDBC a_jdbc = new ArtistaDaoJDBC(dataSource );
			System.err.println(a_jdbc.findAll().get(6).getNomeArtista());
			System.out.println("ALL DONE");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
