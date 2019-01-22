package persistance.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.SQLException;
import model.Artista;
import model.Canzone;
import persistance.DataSource;
import persistance.PersistenceException;
import persistence.dao.ArtistaDao;

public class ArtistaDaoJDBC implements ArtistaDao {
	private DataSource dataSource;
	private Connection connection = null;
	private PreparedStatement statement = null;

	public ArtistaDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(Artista artista) throws SQLException {
		try {
			addArtista(artista);
		} catch (Exception e) {
			e.printStackTrace();
		}

		}

	private void addArtista(Artista artista) throws SQLException {
		try {
			Boolean artistaPresente = false;
			connection = this.dataSource.getConnection();
			String sql = "SELECT Nome FROM artista WHERE nome= ?";
			this.statement = this.connection.prepareStatement(sql);
			statement.setString(1, artista.getNomeArtista());
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String username = rs.getString("nome");
				artistaPresente = true;
				System.out.println(username);
			}

			if (artistaPresente == false) {
				statement.addBatch();
				String insert = "insert into artista(nome) values (?)";
				statement = connection.prepareStatement(insert);
				statement.setString(1, artista.getNomeArtista());
				statement.executeUpdate();
				artistaPresente = false;
				rs.close();
			}

		} catch (Exception e) {
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
//	private void addArtista(Canzone canzone) throws SQLException {
//		try {
//			Boolean artistaPresente = false;
//			connection = this.dataSource.getConnection();
//
//			String sql = "SELECT Nome FROM artista WHERE nome= ?";
//			this.statement = this.connection.prepareStatement(sql);
//			statement.setString(1, canzone.getArtista().getNomeArtista());
//
//			ResultSet rs = statement.executeQuery();
//			//Se è presente nella Resulset imposta l'artista come presente 
//			while (rs.next()) {
//				String username = rs.getString("nome");
//				artistaPresente = true;
//				System.out.println(username);
//			}
//			// Se non è presente nella Resulset imposta l'artista lo crea
//			if (artistaPresente == false) {
//				statement.addBatch();
//				String insert = "insert into artista(nome) values (?)";
//				statement = connection.prepareStatement(insert);
//				statement.setString(1, canzone.getArtista().getNomeArtista());
//				statement.executeUpdate();
//				artistaPresente = false;
//			}
//
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//
//			if (statement != null) {
//				statement.close();
//			}
//
//			if (connection != null) {
//				connection.close();
//			}
//
//		}
//	}

	@Override
	public List<Artista> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Artista artista) {
		Connection connection = this.dataSource.getConnection();
		try {
			//String update = "update canzone SET Nome = ?,Artista = ?, Anno = ? , Genere = ? , IndiceDiGradimento = ? , Album = ? , CasaDiscografica = ? , Url_canzoni = ? WHERE idcanzone = ? ";
			String update="update artista SET nome= ? Where idartista=?";
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, artista.getNomeArtista());
			statement.setInt(2,artista.getIdArtista());
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
	public void delete(Artista artista) {
		Connection connection = this.dataSource.getConnection();
		try {
			String delete = "delete FROM artista WHERE idartista = ? ";
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setInt(1, artista.getIdArtista());
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
