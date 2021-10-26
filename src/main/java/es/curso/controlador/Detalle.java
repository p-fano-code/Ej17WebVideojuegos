package es.curso.controlador;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorVideojuego;

/**
 * Servlet implementation class ListadoJuegos
 */
@WebServlet("/detalle")
public class Detalle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorVideojuego gv = new GestorVideojuego();
	       String id = request.getParameter("id");
	       int idParsed = Integer.parseInt(id);
	       
	       Videojuego v = gv.obtener(idParsed);
	       if(v!=null) {
	    	   request.setAttribute("v", v);
	    	   request.getRequestDispatcher("detalleJuego.jsp").forward(request, response);
	       }else {
	    	   request.getRequestDispatcher("errorDetalle.jsp").forward(request, response);
	       }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
