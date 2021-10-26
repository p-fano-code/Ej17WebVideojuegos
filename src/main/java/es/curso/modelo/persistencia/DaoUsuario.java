package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import es.curso.modelo.entidad.Usuario;

public class DaoUsuario {

	public DaoUsuario() {
		
	}
	
	List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	Usuario u1 = new Usuario(1, "pepe", "1234");
	Usuario u2 = new Usuario(2, "juan", "contrasenia");
	Usuario u3 = new Usuario(3, "manuel", "cachopo");
	
	public List<Usuario> listar(){
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		listaUsuarios.add(u3);
		return listaUsuarios;
	}
	
	public Usuario verificar(String user, String pass) {
		if(user.equals("pepe") && pass.equals("1234")) {
			return u1;
		}else if(user.equals("juan") && pass.equals("contrasenia")) {
			return u2;
		}else if(user.equals("manuel") && pass.equals("cachopo")) {
			return u3;
		}else {
			return null;
		}
		
	}
		
}
