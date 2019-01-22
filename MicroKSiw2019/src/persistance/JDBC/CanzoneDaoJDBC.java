package persistance.JDBC;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

import model.Canzone;
import model.Scuola;
import model.Studente;
import persistance.DataSource;
import persistance.PersistenceException;
import persistence.ScuolaDaoJDBC;
import persistence.StudenteCredenziali;
import persistence.dao.CanzoneDao;
import persistence.dao.ScuolaDao;

public class CanzoneDaoJDBC implements CanzoneDao {
	private DataSource dataSource;
	private Connection connection = null;
	private PreparedStatement statement = null;

	public CanzoneDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Canzone canzone) throws SQLException {
		this.connection = this.dataSource.getConnection();
//Insert tupla
		try {
			String insert = "insert into canzone(titolo,artista,genere,anno,casadiscografica,indicedigradimento,url,album) values (?,?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(insert);
			statement.setString(1, canzone.getTitolo());
			statement.setString(2, canzone.getArtista().getNomeArtista());
			statement.setString(3, canzone.getGenere());
			statement.setInt(4, canzone.getAnno());
			statement.setString(5, canzone.getCasaDiscografica());
			statement.setInt(6, canzone.getIndiceDiGradimento().getVotoAttuale());
			statement.setString(7, canzone.getUrl());
			statement.setString(8, canzone.getAlbum());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}
			addArtista(canzone);
		}

	}

	private void addArtista(Canzone canzone) throws SQLException {
		try {
			Boolean artistaPresente = false;
			connection = this.dataSource.getConnection();

			String sql = "SELECT Nome FROM artista WHERE nome= ?";
			this.statement = this.connection.prepareStatement(sql);
			statement.setString(1, canzone.getArtista().getNomeArtista());

			ResultSet rs = statement.executeQuery();
			//Se è presente nella Resulset imposta l'artista come presente 
			while (rs.next()) {
				String username = rs.getString("nome");
				artistaPresente = true;
				System.out.println(username);
			}
			// Se non è presente nella Resulset imposta l'artista lo crea
			if (artistaPresente == false) {
				statement.addBatch();
				String insert = "insert into artista(nome) values (?)";
				statement = connection.prepareStatement(insert);
				statement.setString(1, canzone.getArtista().getNomeArtista());
				statement.executeUpdate();
				artistaPresente = false;
			}

			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}
	}

	
	public void update(Canzone canzone) {
		Connection connection = this.dataSource.getConnection();
		try {
			//String update = "update canzone SET Nome = ?,Artista = ?, Anno = ? , Genere = ? , IndiceDiGradimento = ? , Album = ? , CasaDiscografica = ? , Url_canzoni = ? WHERE idcanzone = ? ";
			String update="update canzone SET titolo= ?,artista= ?,genere= ?,anno= ?,casadiscografica= ?,indicedigradimento= ?,url= ?,album=? Where idcanzone=?";
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, canzone.getTitolo());
			statement.setString(2, canzone.getArtista().getNomeArtista());
			statement.setString(3, canzone.getGenere());
			statement.setInt(4, canzone.getAnno());
			statement.setString(5, canzone.getCasaDiscografica());
			statement.setInt(6, canzone.getIndiceDiGradimento().getVotoAttuale());
			statement.setString(7, canzone.getUrl());
			statement.setString(8, canzone.getAlbum());
			statement.setInt(9,canzone.getIdCanzone());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
	}

@Override
public List<Canzone> findAll() {
	 connection = this.dataSource.getConnection();
	List<Canzone>canzoni = new LinkedList<>();
	try {
		Canzone canzone;
		PreparedStatement statement;
		String query = "select * from studente";
		statement = connection.prepareStatement(query);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			canzone = new Canzone();
			canzone.setIdCanzone(result.getString("idcanzone"));				
			canzone.setTitolo(result.getString("titolo"));
			canzone.setArtista(result.getString("artista"));
			
			
			ScuolaDao scuolaDao = new ScuolaDaoJDBC(dataSource);
			Scuola scuola = scuolaDao.findByPrimaryKey(result.getLong("scuola_id"));
			canzone.setScuolaDiDiploma(scuola);
			
			studenti.add(canzone);
		}
	} catch (SQLException e) {
		throw new PersistenceException(e.getMessage());
	}	 finally {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		}
	}
	return studenti;
}

	@Override
	public void delete(Canzone canzone) {
		Connection connection = this.dataSource.getConnection();
		try {
			String delete = "delete FROM canzone WHERE idCanzone = ? ";
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setInt(1, canzone.getIdCanzone());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
	}
}
