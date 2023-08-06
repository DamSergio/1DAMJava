package bingo;

import java.util.Arrays;

public class Jugador {
	private String nombre;
	private String nick;
	private int boleto[]=new int[5];
	
	public Jugador () {
		this.nombre="";
		this.nick="";
		this.getBoleto(boleto);
	}
	
	public Jugador (String nombre) {
		this.nombre=nombre;
		this.nick=this.getAlias(nombre);
		this.getBoleto(boleto);
	}
	
	private void getBoleto (int []boleto) {
		int n;
		for (int i=0; i<boleto.length; i++) {
			do {
				n=(int)(1+Math.random()*20);
			} while (correcto(boleto, n, i));
			boleto[i]=n;
		}
	}
	
	private boolean correcto(int[] boleto, int n, int j) {
		for (int i=0; i<=j; i++) {
			if (n==boleto[i]) {
				return true;
			}
		}
		return false;
	}
	
	private String getAlias (String nombre) {
		int n=(int)(Math.random()*101);
		if (nombre.length()<3) {
			return "J"+nombre+n;
		}
		return "J"+nombre.substring(0,3)+n;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int[] getBoleto() {
		return boleto;
	}
	public void setBoleto(int[] boleto) {
		this.boleto = boleto;
	}
	@Override
	public String toString() {
		return "El jugador "+nombre+" con alias "+nick+" tiene el boleto "+Arrays.toString(boleto);
	}
	
	
	
}