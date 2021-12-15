package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registro
 */
@WebServlet("/registro")
public class registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter salida=response.getWriter();
		salida.println("<html><body>");
		//salida.println("Nombre introducido " + request.getParameter("nombre"));
		//salida.println("<br><br>");
		//salida.println("Apellido introducido " + request.getParameter("apellido"));

        int n;
        
        n = Integer.parseInt(request.getParameter("nombre"));
        
        int nn;
        
        nn = Integer.parseInt(request.getParameter("nombre2"));
        
        int nnn;
        
        nnn = Integer.parseInt(request.getParameter("nombre3"));
        
        double b = Math.toRadians(n);
        double bb = Math.toRadians(nn);
        double bbb = Math.toRadians(nnn);
        salida.println("Seno de " + n + " es: " + Math.sin(b) + "<br><br>");
        salida.println("Coseno de " + nn + " es: " + Math.cos(bb) + "<br><br>");
        salida.println("Tangente de " + nnn + " es: " + Math.tan(bbb) + "<br><br>");
		
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
