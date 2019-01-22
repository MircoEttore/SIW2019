package persistance.JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import model.Artista;
import model.Canzone;
import model.IndiceDiGradimento;
import persistance.DataSource;
import persistance.PostgresDAOFactory;

public class JDBCExample {
	public static void main(String args[]) {
		try {
			// PostgresDAOFactory p;
			// p=new PostgresDAOFactory();

			Class.forName("org.postgresql.Driver") ; 
//			DataSource dataSource = new DataSource("jdbc:postgresql://localhost:5432/Database_MicroK", "postgres",
//					"postgres");
			DataSource dataSource = new DataSource("jdbc:postgresql://192.168.1.6:5432/Database_MicroK", "postgres",
					"postgres");
			CanzoneDaoJDBC canzone = new CanzoneDaoJDBC(dataSource);
			IndiceDiGradimento i = new IndiceDiGradimento(6);
			int ii = i.getVotoAttuale();
			Artista a = new Artista("Led Zeppelin");
			Canzone cc = new Canzone(a, "Stairway To Heaven", "Led Zeppelin I", "Heavy Rock", "-", i,
					"notAvaible", 1974);

			System.err.println(cc);
			canzone.save(cc);

			System.out.println("ALL DONE");
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