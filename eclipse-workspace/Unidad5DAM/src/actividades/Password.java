package actividades;

public class Password {
	private String contraseña;
	private int longitud;
	
	public Password () {
		this.longitud=8;
		this.contraseña="";
	}
	
	public Password (String contraseña) {
		this.contraseña=this.generarPassword(contraseña);
		this.longitud=this.contraseña.length();
	}
	
	public String generarPassword (String contraseña) {
		if(contraseña.length()>=6) {
			return contraseña.substring(0,2).toUpperCase()+contraseña.substring(2)+(int)(1+Math.random()*99);
		}else {
			return "";
		}
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
