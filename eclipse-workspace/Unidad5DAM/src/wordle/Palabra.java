package wordle;

public class Palabra {
	String cadena;

	public Palabra(String cadena) {
		this.cadena = cadena;
	}
	
	//devuelve verdadero si la palabra es de 5 letras mayusculas
	
	boolean correcta() {
		return this.cadena.matches("[A-Z]{5}");
	}
	
	public String comparar (Palabra usuario) {
		
		String adivina="";
		for (int i=0; i<usuario.getCadena().length(); i++) {
			if(usuario.getCadena().charAt(i)==this.getCadena().charAt(i)) {
				adivina+=usuario.getCadena().charAt(i);
			} else {
				adivina+=" _ ";
			}
		}
		
		return adivina;
	}
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		return cadena;
	}

	public boolean equals(Palabra p) {
		return this.getCadena().equals(p.getCadena());
	}
	
	
}
