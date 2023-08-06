package ejercicio1;

public class Password {
	private int longitud=8;
	private String contraseña;
	
	public Password() {
		this.longitud=8;
		this.contraseña="";
	}
	
	public Password(String contraseña) {
		this.contraseña=this.generarPassword(contraseña);
		this.longitud=this.contraseña.length();
	}
	
	private String generarPassword(String contraseña) {
		return contraseña.substring(0,2).toUpperCase()+contraseña.substring(2)+(int)(1+Math.random()*99);
	}
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
}
