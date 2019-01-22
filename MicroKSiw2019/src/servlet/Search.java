package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public Search(String string ) {
//        super();
//        //SELECT FROM WHERE 
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String keyWord ; 
		
		keyWord = request.getParameter("artista");
		keyWord = request.getParameter("titolo");
		keyWord = request.getParameter("album");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//public class Search extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String searchCategory = request.getParameter("category");
//		String searchProducer = request.getParameter("producer");
//
//		if (searchCategory != null && !searchCategory.equals("")) {
//			request.setAttribute("category", searchCategory);
//			request.getRequestDispatcher("search.jsp").forward(request, response);
//		} else if (searchProducer != null && !searchProducer.equals("")) {
//			request.setAttribute("producer", searchProducer);
//			request.getRequestDispatcher("search.jsp").forward(request, response);
//		}
//		else {
//			request.getRequestDispatcher("index.jsp").forward(request, response);
//		}
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String searchQuery = request.getParameter("search");
//		if (searchQuery != null && !searchQuery.equals("")) {
//			request.setAttribute("search", searchQuery);
//			request.getRequestDispatcher("search.jsp").forward(request, response);
//		} else {
//			doGet(request, response);
//		}
//	}
//}
