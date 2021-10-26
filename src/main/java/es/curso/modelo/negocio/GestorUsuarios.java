package es.curso.modelo.negocio;

import java.util.List;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.persistencia.DaoUsuario;

public class GestorUsuarios {

	DaoUsuario usuarioDao;
	
	public List<Usuario> listar(){
		usuarioDao = new DaoUsuario();
		return usuarioDao.listar();
	}
	
	public Usuario verificar(String user, String pass) {
		usuarioDao = new DaoUsuario();
		return usuarioDao.verificar(user, pass);
	}
	
}
