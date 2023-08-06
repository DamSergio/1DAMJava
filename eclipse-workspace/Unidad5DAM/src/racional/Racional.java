package racional;

public class Racional {
	private int num;
	private int den;
	
	public Racional (int a, int b) {
		this.setNum(a);
		this.setDen(b);
	}
	
	Racional producto (Racional a) {
		int n=this.getNum()*a.getNum();
		int d=this.getDen()*a.getDen();
		Racional resultado=new Racional(n, d);
		
		return resultado.simpli();
	}
	
	Racional suma (Racional a) {
		int n=0;
		int d=0;
		if (this.den==a.getDen()) {
			n=this.getNum()+a.getNum();
			d=this.getDen();
		} else {
			n=(this.getNum()*a.getDen())+(this.getDen()*a.getNum());
			d=this.getDen()*a.getDen();
		}
		Racional resultado=new Racional(n, d);
		return resultado.simpli();
	}
	
	Racional resta (Racional a) {
		int n=0;
		int d=0;
		if (this.den==a.getDen()) {
			n=this.getNum()-a.getNum();
			d=this.getDen();
		} else {
			n=(this.getNum()*a.getDen())-(this.getDen()*a.getNum());
			d=this.getDen()*a.getDen();
		}
		Racional resultado=new Racional(n, d);
		return resultado.simpli();
	}
	
	Racional division (Racional a) {
		int n=this.getNum()*a.getDen();
		int d=this.getDen()*a.getNum();
		Racional resultado=new Racional(n, d);
		
		return resultado.simpli();
	}
	
	Racional simpli () {
		int n=this.getNum();
		int d=this.getDen();
		int mayor;
		
		if (n>d) {
			mayor=n;
		} else {
			mayor=d;
		}
		
		for (int i=2; i<=mayor; i++) {
			if (n%i==0 && d%i==0) {
				n=n/i;
				d=d/i;
				i=1;
				if (n>d) {
					mayor=n;
				} else {
					mayor=d;
				}
			}
		}
		
		Racional resultado=new Racional(n, d);
		return resultado;
	}
	
	boolean equals (Racional a) {
		return this.num==a.getNum() && this.den==a.getDen();
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		if (den!=0) {
			this.den = den;
		} else {
			System.out.println("el denominador tiene que ser distinto de 0");
			this.den=1;
		}
		
	}
	
	public String toString () {
		return num+"/"+den;
	}
}
