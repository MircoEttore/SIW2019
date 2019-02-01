package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Canzone;
import persistance.DatabaseManager;
import persistence.dao.CanzoneDao;




public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String searchProducer = request.getParameter("search");

		 if (searchProducer != null && !searchProducer.equals("")) {
			request.setAttribute("producer", searchProducer);
			request.getRequestDispatcher("NewFile1.jsp").forward(request, response);
		}

		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Ciao");
		String searchQuery = request.getParameter("search");
		  CanzoneDao udao = DatabaseManager.getInstance().getDaoFactory().getCanzoneDao() ; 
			 List<Canzone>c=new ArrayList();
			  
		  c=udao.findCanzone(searchQuery);
		  
			  for (Canzone canzone : c) {
				  System.out.println( canzone.getTitolo());
			}
		if (searchQuery != null && !searchQuery.equals("")) {
			request.setAttribute("search", searchQuery);
			request.getRequestDispatcher("NewFile1.jsp").forward(request, response);
			System.out.println("Cia1o");

		} else {
			doGet(request, response);
		}
	}
	

}