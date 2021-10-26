package es.curso.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorUsuarios;
import es.curso.modelo.negocio.GestorVideojuego;

/**
 * Servlet implementation class inicio
 */
@WebServlet("/inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorUsuarios gu = new GestorUsuarios();
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		Usuario u = gu.verificar(user, pass);
		
		GestorVideojuego gv = new GestorVideojuego();		
		List<Videojuego> listaVideojuegos = gv.listar();		
		request.setAttribute("listado", listaVideojuegos);
		
		System.out.println(u);
		if (u != null) {
			request.getRequestDispatcher("listaVideojuegos.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("errorLista.jsp").forward(request, response);
		}
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
