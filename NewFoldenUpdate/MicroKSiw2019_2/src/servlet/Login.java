package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utente;
import persistance.DatabaseManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = (String) request.getParameter("username");
//		String logout = request.getParameter("logout");
		String password = (String) request.getParameter("password");

		Utente u= DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().findPrimaryKey(email,password);
		
		System.err.println(u.getEmail());
		
		/*if (username.equals("ciao") && password.equals("suca"))
		{
			response.sendRedirect("LoginFailed.jsp");
		}
		else {
			System.out.println("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
		}*/
		
		
		
//		if (username != null) {
//			RequestDispatcher rd = request.getRequestDispatcher("alreadyLogged.html");
//			rd.forward(request, response);
//		} else {
//			RequestDispatcher rd = request.getRequestDispatcher("LoginFailed.jsp");
//			rd.forward(request, response);
//		}
	}

}
