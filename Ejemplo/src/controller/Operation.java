package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class suma
 */
@WebServlet("/Operation")
public class Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;


    /**
     * Default constructor. 
     */
    public Operation() {
    	super();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int operation = Integer.parseInt(request.getParameter("operation"));
		if(operation == 0) {
			response.getWriter().append(ExecSuma(request.getParameter("a"), request.getParameter("b")));
		}else if(operation == 1) {
			response.getWriter().append(ExecResta(request.getParameter("a"), request.getParameter("b")));
		}
	}

	private String ExecSuma(String a, String b) {
		String value = "";
		try {
			int result = Integer.parseInt(a) + Integer.parseInt(b);
			 value = Integer.toString(result);
			 value = "La Suma da:" + value;
		}catch(Exception e) {
			 value = "Error de formato";
		}
		return value;
	}
	
	private String ExecResta(String a, String b) {
		String value = "";
		try {
			int result = Integer.parseInt(a) - Integer.parseInt(b);
			 value = Integer.toString(result);
			 value = "La Resta da:" + value;
		}catch(Exception e) {
			 value = "Error de formato";
		}
		return value;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println(getServletConfig().getInitParameter("name"));
	}

}
