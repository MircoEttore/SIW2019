package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Utente;
import persistance.DAOFactory;
import persistance.DatabaseManager;
import persistence.dao.UtenteDao;

public class Singup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Suxcca");
		Utente registrazioneUtente = new Utente();
		registrazioneUtente.setNome(request.getParameter("nome"));
		registrazioneUtente.setCognome(request.getParameter("cognome"));
		registrazioneUtente.setIndirizzo(request.getParameter("indirizzo"));
		registrazioneUtente .setEmail(request.getParameter("email"));
		registrazioneUtente.setPassword(request.getParameter("password"));
		DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().save(registrazioneUtente);}
		/*
		String nome = request.getParameter("nome") ; 
		String cognome = request.getParameter("cognome") ; 
		String nickname = request.getParameter("nickname") ; 
		String email = request.getParameter("email") ; 
		String [] utenteArtista = request.getParameterValues("checkedRows"); 
		String password = request.getParameter("password") ; 
		String indirizzo = request.getParameter("indirizzo") ; 

		System.out.println("Utente artista ha come valote questo : "+utenteArtista);
		
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.POSTGRESQL);
		try {
		
			Class.forName("org.postgresql.Driver");
			
			UtenteDao uDao = factory.getUtenteDAO();
			Utente u = new Utente() ; 
			u.setNome(nome);
			u.setCognome(cognome);
			u.setEmail(email);
			u.setNickname(nickname);
			u.setPassword(password);
			u.setIndirizzo(indirizzo);
			
			System.out.println("DEBUG : 48 ");
			
			uDao.save(u); 

			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("SALVATO");

	}
*/
}
