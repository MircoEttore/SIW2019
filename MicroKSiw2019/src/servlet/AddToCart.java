package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddTocart
 */
@WebServlet("/AddTocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public AddToCart() {
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
		doGet(request, response);
	}

}

/*	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("search value is: " + request.getParameter("search"));
		String referer = request.getParameter("from");
		if (request.getParameter("id") != null && !request.getParameter("id").equals("")) {
			System.out.println("get if");
			doPost(request, response);
		} else {
			request.getRequestDispatcher(referer).forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String addToCart = request.getParameter("id");
		String referer = request.getParameter("from");
		System.out.println(DBManager.getInstance().getUserDAO().addToCart((String) request.getSession().getAttribute("email"),
				(Integer.valueOf(addToCart) - 1029384756)));
		request.setAttribute("search", request.getParameter("search"));
		request.getRequestDispatcher(referer).forward(request, response);
	}
*/
