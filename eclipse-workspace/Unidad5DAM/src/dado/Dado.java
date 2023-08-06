package dado;

public class Dado {
	private int cara;

	
	public Dado() {
		this.cara = 0;
	}
	
	public void lanzar () {
		this.cara=((int)(1+Math.random()*6));
	}
	
	public int getCara() {
		return cara;
	}

	public void setCara(int dado) {
		this.cara = dado;
	}

	public String toString() {
		return "|"+this.cara+"|";
	}
	
	
}
