package persistance.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Evento;
import persistance.DataSource;
import persistence.dao.EventoDao;

public class EventoDaoJDBC implements EventoDao{

	private DataSource dataSource;
	private Connection connection = null;
	private PreparedStatement statement = null;
	
	
	public EventoDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void save(Evento evento) throws SQLException {
		try {
			addEvento(evento);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addEvento(Evento evento) {
		try {
			Boolean eventoPresente = false;
			connection = this.dataSource.getConnection();
			String sql = "SELECT Nome FROM evento WHERE idevento= ?";
			this.statement = this.connection.prepareStatement(sql);
			statement.setString(1, evento.getNomeEvento());
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String nomeEvento = rs.getString("nomeevento");
				eventoPresente = true;
				System.out.println(nomeEvento);
			}

			if (eventoPresente == false) {
				statement.addBatch();
				String insert = "insert into evento(nomeevento) values (?)";
				statement = connection.prepareStatement(insert);
				statement.setString(5, evento.getNomeEvento());
				statement.executeUpdate();
				eventoPresente = false;
				rs.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}


	@Override
	public List<Evento> findAll() {
		return null;
	}

	@Override
	public void update(Evento evento) {
		
	}

	@Override
	public void delete(Evento evento) {
		
	}

}
