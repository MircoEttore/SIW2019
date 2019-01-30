package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String searchProducer = request.getParameter("producer");

		 if (searchProducer != null && !searchProducer.equals("")) {
			request.setAttribute("producer", searchProducer);
			request.getRequestDispatcher("search.jsp").forward(request, response);
		}

		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String searchQuery = request.getParameter("search");
		if (searchQuery != null && !searchQuery.equals("")) {
			request.setAttribute("search", searchQuery);
			request.getRequestDispatcher("search.jsp").forward(request, response);
		} else {
			doGet(request, response);
		}
	}
	

}