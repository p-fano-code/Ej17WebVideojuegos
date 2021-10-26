package es.curso.modelo.entidad;

public class Usuario {

	int id;
	String usuario;
	String contrasenia;
	
	public Usuario(int id, String usuario, String contrasenia) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + "]";
	}
	
	
}
