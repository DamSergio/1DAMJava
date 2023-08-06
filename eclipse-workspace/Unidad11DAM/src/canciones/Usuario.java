package canciones;

public class Usuario extends Persona {
	private String tipoMusica;

	public Usuario() {
		super();
		this.tipoMusica = "";
	}
	
	public Usuario(String dNI, String nombre, String apellido, String direccion, String usuario, String clave,
			String tipoMusica) {
		super(dNI, nombre, apellido, direccion, usuario, clave);
		this.tipoMusica = tipoMusica;
	}

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	@Override
	public String toString() {
		return "Usuario [tipoMusica=" + tipoMusica + "]";
	}
}
