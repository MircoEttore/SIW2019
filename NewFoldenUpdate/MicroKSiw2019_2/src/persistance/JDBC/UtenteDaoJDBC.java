package persistance.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Utente;

import persistance.DataSource;
import persistance.PersistenceException;
import persistance.UtenteCredenziali;
import persistence.dao.UtenteDao;

public class UtenteDaoJDBC implements UtenteDao {
	private DataSource dataSource;
	private PreparedStatement statement = null;

	public UtenteDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
			String insert = "insert into utente(nome,cognome,nickname,email,utente_artista,password,indirizzo) values (?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(insert);
			statement.setString(1, utente.getNome());
			statement.setString(2, utente.getCognome());
			statement.setString(3, utente.getNickname());
			statement.setString(4, utente.getEmail());
			statement.setBoolean(5, utente.isUtenteartista());
			statement.setString(6, utente.getPassword());
			statement.setString(7, utente.getIndirizzo());
			statement.executeUpdate();
			System.out.println("Record inserita nella tabella!");

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
	public List<Utente> findAll() {

		Connection connection = this.dataSource.getConnection();
		ArrayList<Utente> utenti = new ArrayList<>();
		try {
			Utente utente;
			PreparedStatement statement;
			String query = "select * from utente";
			statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				utente = new Utente();
				utente.setIdUtente(result.getInt("id_utente"));
				utente.setNome(result.getString("nome"));
				utente.setCognome(result.getString("cognome"));
				utente.setNickname(result.getString("nickname"));
				utente.setEmail(result.getString("email"));
				utente.setUtenteartista(result.getBoolean("utente_artista"));
				utente.setPassword((result.getString("password")));
				utente.setIndirizzo(result.getString("indirizzo"));

				utenti.add(utente);
			}
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
		return utenti;
	}

	public void update(Utente utente) {
		 Connection connection = this.dataSource.getConnection();
		try {
			String update = "update utente SET nome=?,cognome=?,nickname=?,email=?,utente_artista=? password=?,indirizzo=? WHERE id_utente=?";

			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, utente.getNome());
			statement.setString(2, utente.getCognome());
			statement.setString(3, utente.getNickname());
			statement.setString(4, utente.getEmail());
			statement.setBoolean(5, utente.isUtenteartista());
			statement.setInt(6, utente.getIdUtente());
			statement.setString(7, utente.getPassword());
			statement.setString(8, utente.getIndirizzo());
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

	public void delete(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
			String delete = "delete FROM utente WHERE id_utente = ? ";
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setInt(1, utente.getIdUtente());
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
	public Utente findByPrimaryKey1(String email) {
		Connection connection = this.dataSource.getConnection();
		Utente user = null;
		try {
			PreparedStatement statement;
			String query = "select * from user where email=?";
			statement = (PreparedStatement) connection.prepareStatement(query);
			statement.setString(1, email);
			ResultSet results = statement.executeQuery();
			while (results.next()) {
				user = new Utente();
				user.setIdUtente(results.getInt("id_utente"));
				user.setNome(results.getString("name"));
				user.setCognome(results.getString("cognome"));
				user.setEmail(results.getString("email"));
				user.setIndirizzo(results.getString("indirizzo"));
				user.setPassword(results.getString("password"));
			}

		} catch (Exception e) {
			// return null;
//			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// return null;
//				throw new PersistenceException(e.getMessage());
			}
		}
		try {
			if (!connection.isClosed())
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		return user;
	}
	@Override
	public UtenteCredenziali findByPrimaryKeyCredential(String email) {
		Utente stud = findByPrimaryKey1(email);
		UtenteCredenziali studCred = null;
		if (stud != null){
			studCred = new UtenteCredenziali(dataSource);
			studCred.setIdUtente(stud.getIdUtente());
			studCred.setCognome(stud.getCognome());
			studCred.setNome(stud.getNome());
			
		}
		return studCred;
	}
	
	
	private Utente findByPrimaryKey(String email) {
		Connection connection = this.dataSource.getConnection();
		Utente u = new Utente ();
		try {
			PreparedStatement statement;
			String query = "select * from utente where email=?  ";
			statement = (PreparedStatement) connection.prepareStatement(query);
			statement.setString(1,email);
			
			ResultSet results = statement.executeQuery();
			while (results.next()) {
				
				u.setIdUtente(results.getInt("id_utente"));
				u.setNome(results.getString(("nome")));
				u.setCognome(results.getString("cognome"));
				u.setIndirizzo(results.getString("indirizzo"));
				u.setEmail(results.getString("email"));
				u.setPassword(results.getString("password"));
				
				
			}
		} catch (Exception e) {
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
		try {
			if (!connection.isClosed())
				connection.close();
		} catch (SQLException e) {

		}
		return u;

	}
	

	@Override
	public Utente findPrimaryKey(String email, String password) {
		Connection connection = this.dataSource.getConnection();
		Utente u = new Utente ();
		try {
			PreparedStatement statement;
			String query = "select * from utente where email=? AND password=? ";
			statement = (PreparedStatement) connection.prepareStatement(query);
			statement.setString(1,email);
			statement.setString(2,password);
			ResultSet results = statement.executeQuery();
			while (results.next()) {
				
				u.setIdUtente(results.getInt("id_utente"));
				u.setNome(results.getString(("nome")));
				u.setCognome(results.getString("cognome"));
				u.setIndirizzo(results.getString("indirizzo"));
				u.setEmail(results.getString("email"));
				u.setPassword(results.getString("password"));
				
				
			}
		} catch (Exception e) {
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
		try {
			if (!connection.isClosed())
				connection.close();
		} catch (SQLException e) {

		}
		return u;

	}
}
