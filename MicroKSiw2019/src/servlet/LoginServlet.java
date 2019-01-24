package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utente;
import persistance.DatabaseManager;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	 public LoginServlet() {
	  super();
	 }

	 @Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	   throws ServletException, IOException {

	  RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	  dispatcher.forward(request, response);
	 }

	 @Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	   throws ServletException, IOException {
	  String email = request.getParameter("email");
	  String password = request.getParameter("password");
//	  new Utente("nome=?","cognome=?","nickname=?","email=?",false ,"password=?","indirizzo=?");
	  Utente tryLogin = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO().findPrimaryKey(email, password) ; 

	  if (email != null && password != null) {
	   if (tryLogin != null) {
	/*    HttpSession session = request.getSession(true);
	    if (session.getAttribute("username") != tryLogin.getNome()) {
	     request.getSession().setAttribute("username", tryLogin.getNome());
	     request.getSession().setAttribute("email", tryLogin.getEmail());
	     request.getSession().setAttribute("userId", tryLogin.getIdUtente());*/
	    //}
	    response.sendRedirect("LoginFailed.jsp");
	    response.setStatus(HttpServletResponse.SC_OK);
	   } else {
	    request.getSession().setAttribute("loginMessage", "Wrong username or password");
	    response.sendRedirect("LoginFailed.jsp");
	    response.setStatus(HttpServletResponse.SC_OK);
	   }
	  }
	 }
	}
