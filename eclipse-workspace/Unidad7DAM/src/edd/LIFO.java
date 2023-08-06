package edd;

import java.util.Stack;

public class LIFO { //LAST IN FIRTS OUT
	private Stack<Proceso> pLifo; 
	
	public LIFO() {
		this.pLifo = new Stack<>();
	}
	
	public Stack<Proceso> getpLifo() {
		return pLifo;
	}

	public void setpLifo(Stack<Proceso> pLifo) {
		this.pLifo = pLifo;
	}
	
	@Override
	public String toString() {
		String cadena="";
		for (Proceso i:this.getpLifo()) {
			cadena="|"+i.getNombre()+"|\n"+cadena;
		}
		return cadena;
	}

	public static void main(String[] args) {
		//CREAMOS EL STACK
		LIFO l=new LIFO();
		Proceso p1=new Proceso("pro1", 12, "proceso1", 1, 12500);
		Proceso p2=new Proceso("pro2", 14, "proceso2", 1, 2550);
		Proceso p3=new Proceso("pro3", 16, "proceso3", 0, 500);
		
		//APILAMOS LOS OBJETOS
		l.getpLifo().push(p1); 
		l.getpLifo().push(p2);
		l.getpLifo().push(p3);
		
		//MIRO EL TOPE DE LA PILA
		System.out.println("Tope de la pila: "+l.getpLifo().peek().getNombre());
		
		//IMPRIMIMOS LA PILA
		System.out.println(l);
		
		//SACAMOS EL ULTIMO DE LA PILA
		l.getpLifo().pop();
		
		System.out.println(l);
		
		//VEMOS SI LA PILA ESTA VACIA
		do {
			System.out.println("Tope de la pila: "+l.getpLifo().peek().getNombre());
			l.getpLifo().pop();
			System.out.println(l);
		} while (!l.getpLifo().isEmpty());
		
		System.out.println("Esta vacia");
	}

}
