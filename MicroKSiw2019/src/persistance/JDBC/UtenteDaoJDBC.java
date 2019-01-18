package persistance.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Utente;
import model.Utente;
import model.Utente;
import persistance.DataSource;
import persistance.PersistenceException;
import persistence.dao.UtenteDao;

public class UtenteDaoJDBC implements UtenteDao{
	private DataSource dataSource;

	public UtenteDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
			String insert = "insert into utente(Nome,Cognome,Nickname,Email,idUtente, utenteartista ) values (?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insert);
			statement.setString(1, utente.getNome());
			statement.setString(2,utente.getCognome());
			statement.setString(3, utente.getNickname());
			statement.setString(4, utente.getEmail());
			statement.setInt(5,utente.getIdUtente());
			statement.setBoolean(6, utente.isUtenteartista());
			
			
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
	
	
	public void update(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
			String update ="update canzone SET Nome=?,Cognome=?,Nickname=?,Email=?,idUtente=?, utenteartista=? WHERE idUtente=?";
			
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, utente.getNome());
			statement.setString(2,utente.getCognome());
			statement.setString(3, utente.getNickname());
			statement.setString(4, utente.getEmail());
			statement.setInt(5,utente.getIdUtente());
			statement.setBoolean(6, utente.isUtenteartista());
			
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
			String delete = "delete FROM studente WHERE idUtente = ? ";
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
	
	
}
