package edd;

import java.util.LinkedList;

public class Cola <T>{
	private LinkedList<T> c;

	public Cola() {
		this.c = new LinkedList<>();
	}
	
	public Cola(LinkedList<T> c) {
		this.c = c;
	}

	public LinkedList<T> getC() {
		return c;
	}

	public void setC(LinkedList<T> c) {
		this.c = c;
	}
	
	public void poner(T objeto) {
		this.c.addFirst(objeto);
	}
	public T salir(){
		return this.c.removeLast();
	}
}
