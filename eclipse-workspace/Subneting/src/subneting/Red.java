package subneting;

import java.util.ArrayList;

public class Red {
	private String ip;
	private String mascara;
	private int prefijo;
	
	public Red() {
		super();
		this.ip = "";
		this.mascara = "";
		this.prefijo = 0;
	}
	
	public Red(String ip, String mascara, int prefijo) {
		super();
		this.ip = ip;
		this.mascara = mascara;
		this.prefijo = prefijo;
	}
	
	public Red(String ip, String mascara) {
		super();
		this.ip = ip;
		this.mascara = mascara;
		this.prefijo=this.generarPrefijo();
	}
	
	public Red(String ip, int prefijo) {
		super();
		this.ip = ip;
		this.prefijo = prefijo;
		this.mascara = this.generarMascara();
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}
	
	public int generarPrefijo() {
		String linea[];
		linea=this.getMascara().split("\\.");
		
		int pre=0;
		
		for (int i=0; i<linea.length; i++) {
			int n=Integer.parseInt(linea[i]);
			ArrayList<Integer> bin=new ArrayList<>();
			
			while (n>0) {
				bin.add(n%2);
				n/=2;
			}
			
			for (Integer j:bin) {
				if (j==1) {
					pre++;
				}
			}
		}
		
		return pre;
	}
	
	public String generarMascara() {
		int mas[]= {128,64,32,16,8,4,2,1};
		int octeto[]=new int[4];
		
		int op=this.prefijo/8;
		int resto=this.prefijo%8;
		
		switch (op) {
		case 4:
			for (int i=0; i<8; i++) {
				octeto[3]+=mas[i];
			}
		case 3:
			for (int i=0; i<8; i++) {
				octeto[2]+=mas[i];
			}
		case 2:
			for (int i=0; i<8; i++) {
				octeto[1]+=mas[i];
			}
		case 1:
			for (int i=0; i<8; i++) {
				octeto[0]+=mas[i];
			}
		}
		
		for (int i=0; i<resto; i++) {
			octeto[op]+=mas[i];
		}
		
		
		return octeto[0]+"."+octeto[1]+"."+octeto[2]+"."+octeto[3];
	}

	@Override
	public String toString() {
		return "Red [ip=" + ip + ", mascara=" + mascara + ", prefijo=" + prefijo + "]";
	}
	
	
//	public static void main(String[] args) {
//		Red r=new Red("192.0.0.0","255.192.0.0");
//		
//		System.out.println(r.getPrefijo());
//		
//		System.out.println("*********************");
//		
//		Red r2=new Red("192.0.0.0",19);
//		
//		System.out.println(r2.getMascara());
//	}
}
