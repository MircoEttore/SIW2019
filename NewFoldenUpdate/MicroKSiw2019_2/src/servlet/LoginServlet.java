package servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import model.Utente;
import persistance.DAOFactory;
import persistance.DataSource;
import persistance.DatabaseManager;
import persistance.PostgresDAOFactory;
import persistance.UtenteCredenziali;

import persistence.dao.UtenteDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		// dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.POSTGRESQL);
		UtenteDao sDao = factory.getUtenteDAO();
		Utente s = sDao.findByPrimaryKeyq(username);

		if (s == null) {
			System.out.println("esdaaaaaaaaaaaaaai");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFailed.jsp");
			rd.forward(req, resp);
		} else {
			if (s.getPassword().equals(password)) {
				req.getSession().setAttribute("username", username);
				req.setAttribute("studente", s);
				System.out.println("evvai");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
			} else {
				System.out.println("evvdddddddddddai");
				RequestDispatcher rd = req.getRequestDispatcher("loginFailed.html");
				rd.forward(req, resp);
			}
		}
	}
	/*
	 * @Override protected void doPost(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException { String
	 * email = request.getParameter("email"); String password =
	 * request.getParameter("password");
	 * 
	 * Utente tryLogin =
	 * DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().findPrimaryKey(
	 * email,password);
	 * 
	 * if (email != null && password != null) { if (tryLogin != null) { HttpSession
	 * session = request.getSession(true); if (session.getAttribute("username") !=
	 * tryLogin.getEmail()) { request.getSession().setAttribute("username",
	 * tryLogin.getEmail()); request.getSession().setAttribute("email",
	 * tryLogin.getEmail()); request.getSession().setAttribute("userId",
	 * tryLogin.getIdUtente()); } response.sendRedirect("LoginFailed.jsp");
	 * response.setStatus(HttpServletResponse.SC_OK); } else {
	 * request.getSession().setAttribute("loginMessage",
	 * "Wrong username or password"); response.sendRedirect("LoginIN.jsp");
	 * response.setStatus(HttpServletResponse.SC_OK); } } }
	 */
}