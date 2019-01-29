package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utente;
import persistance.DAOFactory;
import persistance.DatabaseManager;
import persistence.dao.UtenteDao;


public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
System.out.println("Suxcca");
		Utente registrazioneUtente = new Utente();
		registrazioneUtente.setNome(request.getParameter("nome"));
		registrazioneUtente.setCognome(request.getParameter("cognome"));
		registrazioneUtente.setNickname(request.getParameter("nickname"));
		registrazioneUtente.setUtenteartista(false);
		registrazioneUtente.setIndirizzo(request.getParameter("indirizzo"));
		registrazioneUtente .setEmail(request.getParameter("email"));
		registrazioneUtente.setPassword(request.getParameter("password"));
		DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().save(registrazioneUtente);
		/*switch (DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().save(registeringUser)) {
		case 0:
			request.setAttribute("signupMessage", "Registration successfull");
			System.out.println("Registration successfull");
			break;

		case 1:
			request.setAttribute("signupMessage", "User already exists");
			System.out.println("User already exists");
			break;

		default:
			request.setAttribute("signupMessage", "Some mistery error");
			System.out.println("Some mistery error");
			break;
		}

		this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);*/
	}
	}
	


