package persistance.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

import model.Canzone;
import persistance.DataSource;
import persistance.PersistenceException;
import persistence.dao.CanzoneDao;

public class CanzoneDaoJDBC implements CanzoneDao {
	private DataSource dataSource;
	private Connection connection = null;
	private PreparedStatement statement = null;

	public CanzoneDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Canzone canzone) {
		this.connection=this.dataSource.getConnection();
		

		try {
			String insert = "insert into canzone(titolo,artista,genere,anno,casadiscografica,indicedigradimento,url) values (?,?,?,?,?,?,?)";
			 statement = connection.prepareStatement(insert);
			statement.setString(1, canzone.getTitolo());
			statement.setString(2, canzone.getArtista().getNomeArtista());
			statement.setString(3, canzone.getGenere());
			statement.setInt(4, canzone.getAnno());
			statement.setString(5, canzone.getCasaDiscografica());
			statement.setInt(6, canzone.getIndiceDiGradimento().getVotoAttuale());
			statement.setString(7, canzone.getUrl());

			statement.executeUpdate();
statement.close();

		addArtista(canzone);

		} catch (Exception e) {
			e.printStackTrace();
		}

}
	private void addArtista(Canzone canzone) {
			try {
			
		String insert = "insert into artista(nome) values (?)";
		this.statement=this.connection.prepareStatement(insert);
			statement.setString(1, canzone.getArtista().getNomeArtista());
			statement.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * public Studente findByPrimaryKey(String matricola) { Connection connection =
	 * this.dataSource.getConnection(); Studente studente = null; try {
	 * PreparedStatement statement; String query =
	 * "select * from studente where matricola = ?"; statement =
	 * connection.prepareStatement(query); statement.setString(1, matricola);
	 * ResultSet result = statement.executeQuery(); if (result.next()) { studente =
	 * new Studente(); studente.setMatricola(result.getString("matricola"));
	 * studente.setNome(result.getString("nome"));
	 * studente.setCognome(result.getString("cognome")); long secs =
	 * result.getDate("data_nascita").getTime(); studente.setDataNascita(new
	 * java.util.Date(secs));
	 * 
	 * ScuolaDao scuolaDao = new ScuolaDaoJDBC(dataSource); Scuola scuola =
	 * scuolaDao.findByPrimaryKey(result.getLong("scuola_id"));
	 * studente.setScuolaDiDiploma(scuola); } } catch (SQLException e) { throw new
	 * PersistenceException(e.getMessage()); } finally { try { connection.close(); }
	 * catch (SQLException e) { throw new PersistenceException(e.getMessage()); } }
	 * return studente; }
	 * 
	 * @Override public StudenteCredenziali findByPrimaryKeyCredential(String
	 * matricola) { Studente stud = findByPrimaryKey(matricola); StudenteCredenziali
	 * studCred = null; if (stud != null){ studCred = new
	 * StudenteCredenziali(dataSource); studCred.setMatricola(stud.getMatricola());
	 * studCred.setCognome(stud.getCognome()); studCred.setNome(stud.getNome());
	 * studCred.setScuolaDiDiploma(stud.getScuolaDiDiploma());
	 * studCred.setDataNascita(stud.getDataNascita()); } return studCred; }
	 * 
	 * public List<Studente> findAll() { Connection connection =
	 * this.dataSource.getConnection(); List<Studente> studenti = new
	 * LinkedList<>(); try { Studente studente; PreparedStatement statement; String
	 * query = "select * from studente"; statement =
	 * connection.prepareStatement(query); ResultSet result =
	 * statement.executeQuery(); while (result.next()) { studente = new Studente();
	 * studente.setMatricola(result.getString("matricola"));
	 * studente.setNome(result.getString("nome"));
	 * studente.setCognome(result.getString("cognome")); long secs =
	 * result.getDate("data_nascita").getTime(); studente.setDataNascita(new
	 * java.util.Date(secs));
	 * 
	 * ScuolaDao scuolaDao = new ScuolaDaoJDBC(dataSource); Scuola scuola =
	 * scuolaDao.findByPrimaryKey(result.getLong("scuola_id"));
	 * studente.setScuolaDiDiploma(scuola);
	 * 
	 * studenti.add(studente); } } catch (SQLException e) { throw new
	 * PersistenceException(e.getMessage()); } finally { try { connection.close(); }
	 * catch (SQLException e) { throw new PersistenceException(e.getMessage()); } }
	 * return studenti; }
	 */
	public void update(Canzone canzone) {
		Connection connection = this.dataSource.getConnection();
		try {
			String update = "update canzone SET Nome = ?,Artista = ?, Anno = ? , Genere = ? , IndiceDiGradimento = ? , Album = ? , CasaDiscografica = ? , Url_canzoni = ? WHERE idcanzone = ? ";

			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, canzone.getTitolo());
			statement.setString(2, canzone.getArtista().getNomeArtista());
			statement.setInt(3, canzone.getAnno());
			statement.setString(4, canzone.getGenere());
			statement.setInt(5, canzone.getIndiceDiGradimento().getVotoAttuale());
			statement.setString(6, canzone.getAlbum());
			statement.setString(7, canzone.getCasaDiscografica());
			statement.setString(8, canzone.getUrl());
			statement.setInt(9, canzone.getIdCanzone());
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

	/*
	 * 
	 * 
	 * @Override public void setPassword(Studente studente, String password) {
	 * Connection connection = this.dataSource.getConnection(); try { String update
	 * = "update studente SET password = ? WHERE matricola=?"; PreparedStatement
	 * statement = connection.prepareStatement(update); statement.setString(1,
	 * password); statement.setString(2, studente.getMatricola());
	 * statement.executeUpdate(); } catch (SQLException e) { throw new
	 * PersistenceException(e.getMessage()); } finally { try { connection.close(); }
	 * catch (SQLException e) { throw new PersistenceException(e.getMessage()); } }
	 * 
	 * }
	 */

	@Override
	public void delete(Canzone canzone) {
		Connection connection = this.dataSource.getConnection();
		try {
			String delete = "delete FROM Canzone WHERE idCanzone = ? ";
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
