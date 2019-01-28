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



/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Utente registrazioneUtente = new Utente();
		registrazioneUtente.setNome(request.getParameter("name"));
		registrazioneUtente.setCognome(request.getParameter("cognome"));
		
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
	


