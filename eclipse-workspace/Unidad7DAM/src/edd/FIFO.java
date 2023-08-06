package edd;

public class FIFO {
	private Cola<Proceso> pFifo;
	
	public FIFO() {
		this.pFifo = new Cola<>();
	}
	
	public Cola<Proceso> getpFifo() {
		return pFifo;
	}

	public void setpFifo(Cola<Proceso> pFifo) {
		this.pFifo = pFifo;
	}
	
	@Override
	public String toString() {
		String cadena="";
		for (Proceso i:this.pFifo.getC()) {
			cadena="|"+i.getNombre()+"|\n"+cadena;
		}
		return cadena;
	}

	public static void main(String[] args) {
		//CREAMOS EL STACK
		FIFO f=new FIFO();
		Proceso p1=new Proceso("pro1", 12, "proceso1", 1, 12500);
		Proceso p2=new Proceso("pro2", 14, "proceso2", 1, 2550);
		Proceso p3=new Proceso("pro3", 16, "proceso3", 0, 500);
		
		f.getpFifo().poner(p1);
		f.getpFifo().poner(p2);
		f.getpFifo().poner(p3);
		
		System.out.println(f);
		
		do {
			System.out.println("Tope de la pila: "+f.getpFifo().getC().getLast());
			f.getpFifo().getC().removeLast();
			System.out.println(f);
		} while (!f.getpFifo().getC().isEmpty());
		
		System.out.println("Esta vacia");
	}

}
