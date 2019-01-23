package persistance;


	import java.sql.*;

	public class DataSource {
		
		final private String dbURI;// = "jdbc:postgresql://localhost/test";
		final private String userName;// = "postgres";
		final private String password;// = "postgres";
		public static DataSource dataSource ; 
		

		public static DataSource  getInstance () {
			if (dataSource == null)
			{
				dataSource = new DataSource("jdbc:postgresql://192.168.43.197:5432/Database_MicroK", "postgres", "postgres");
			}
			return dataSource ; 
		}
		
		private DataSource(String dbURI, String userName, String password) {
			this.dbURI=dbURI;
			this.userName=userName;
			this.password=password;
		}

		public Connection getConnection() throws PersistenceException {
			Connection connection = null;
			try {
				//crea la connessione con l'origine dati
			    connection = DriverManager.getConnection(dbURI,userName, password);
				
			
			} catch(SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
			return connection;
		}
	}


