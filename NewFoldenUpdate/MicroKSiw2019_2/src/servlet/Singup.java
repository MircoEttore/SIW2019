package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utente;
import persistance.DAOFactory;
import persistence.dao.UtenteDao;

/**
 * Servlet implementation class Singup
 */
@WebServlet("/Singup")
public class Singup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Singup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
		String nome = request.getParameter("nome") ; 
		String cognome = request.getParameter("cognome") ; 
		String nickname = request.getParameter("nickname") ; 
		String email = request.getParameter("email") ; 
		String utenteArtista = request.getParameter("checkbox"); 
		String password = request.getParameter("password") ; 
		String indirizzo = request.getParameter("indirizzo") ; 
		
		boolean checked = false ; 
		
		if (utenteArtista.equals(true))
			checked = true ; 
		
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.POSTGRESQL);
		UtenteDao uDao = factory.getUtenteDAO();
		Utente u = new Utente() ; 
		u.setNome(nome);
		u.setCognome(cognome);
		u.setEmail(email);
		u.setNickname(nickname);
		u.setUtenteartista(checked);
		u.setPassword(password);
		u.setIndirizzo(indirizzo);
		
		uDao.save(u); 
		
		System.out.println("SALVATO");
	}

}
