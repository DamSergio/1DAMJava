package subneting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Programa {
	
	public Programa() {
		
	}

	public static void main(String[] args) {
		Programa p=new Programa();
		Red r=new Red("192.169.0.56",15);
		
		System.out.println(r);
		
		for (Red i:p.generarSubredes(r)) {
			System.out.println(i);
		}
		

	}
	
	public ArrayList<Red> generarSubredes(Red red){
		Scanner t=new Scanner(System.in);
		ArrayList<Red> subRedes=new ArrayList<>();
		String mascara[]=pasarBinario(red.getMascara());
		
		
		int cont=0;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<mascara[0].length(); j++) {
				if (mascara[i].charAt(j)=='0') {
					cont++;
				}
			}
		}
		
		int nRedes=2;
		for (int i=1; i<cont; i++) {
			nRedes*=2;
		}
		
		System.out.println("Puedes hacer un total de: "+nRedes);
		System.out.println("Cuantas quieres hacer?");
		int op=t.nextInt();
		int n=op;
		
		int redes=0;
		while (op>1) {
			redes++;
			op/=2;
		}
		
		int aux=redes;
		
		String ip[]=pasarBinario(red.getIp());
		Integer posicion=null;
		
		for (int i=0; i<4 && aux>0; i++) {
			for (int j=0; j<mascara[0].length() && aux>0; j++) {
				if (mascara[i].charAt(j)=='0') {
					mascara[i]=mascara[i].substring(0,j)+'1'+mascara[i].substring(j+1);
					if (posicion==null) {
						posicion=j;
					}
					aux--;
				}
			}
		}
		
		int octeto=red.getPrefijo()/8;
		aux=redes;
		
		for (int i=posicion; i<ip[0].length() && aux>0; i++) {
			ip[octeto]=ip[octeto].substring(0,i)+'0'+ip[octeto].substring(i+1);
			aux--;
		}
		
		for (int i=octeto+1; i<4; i++) {
			ip[i]=ip[i].replace('1', '0');
		}
		
		Red nuevaRed=new Red(pasarDecimal(ip), pasarDecimal(mascara));
		
		octeto=nuevaRed.getPrefijo()/8;
		
		String ipBinario[]=pasarBinario(nuevaRed.getIp());
		String ipSinPuntos=ipBinario[0]+ipBinario[1]+ipBinario[2]+ipBinario[3];
		String mascaraBinario[]=pasarBinario(nuevaRed.getMascara());
		String mascaraSinPuntos=mascaraBinario[0]+mascaraBinario[1]+mascaraBinario[2]+mascaraBinario[3];
		
		String sub="";
		for (int i=0; i<redes; i++) {
			sub+="0";
		}
		
		aux=redes-1;
		
		int pos2=0;
		for (int i=mascaraSinPuntos.length()-1; i>=0; i--) {
			if (pos2==0 && mascaraSinPuntos.charAt(i)=='1') {
				pos2=i;
			}
		}
		
		for (int i=0; i<n; i++) {
			String res=bin(i, sub);
			
			ipSinPuntos=ipSinPuntos.substring(0,pos2-aux)+res+ipSinPuntos.substring(pos2+1);
			String nIp=ipSinPuntos.substring(0,8)+"."+ipSinPuntos.substring(8,16)+"."+ipSinPuntos.substring(16,24)+"."+ipSinPuntos.substring(24);
			String nIpBuena[]=nIp.split("\\.");
			subRedes.add(new Red(pasarDecimal(nIpBuena), nuevaRed.getMascara()));
		}
		
		
		//System.out.println(nuevaRed);
		
		return subRedes;
	}
	
	public String bin(int n, String cad) {
		LinkedList<Integer> binario=new LinkedList<>();
		
		while (n>0) {
			binario.add(n%2);
			n/=2;
		}
		
		for (int j=cad.length()-1; j>=0; j--) {
			if (!binario.isEmpty()) {
				cad=cad.substring(0,j)+binario.removeFirst()+cad.substring(j+1);
			}
		}
		return cad;
	}
	
	public String[] pasarBinario(String cadena) {
		String linea[]=cadena.split("\\.");
		
		for (int i=0; i<linea.length; i++) {
			String octeto="00000000";
			int n=Integer.parseInt(linea[i]);
			LinkedList<Integer> binario=new LinkedList<>();
			
			while (n>0) {
				binario.add(n%2);
				n/=2;
			}
			
			for (int j=7; j>=0; j--) {
				if (!binario.isEmpty()) {
					octeto=octeto.substring(0,j)+binario.removeFirst()+octeto.substring(j+1);
				}
			}
			linea[i]=octeto;
		}
		
		return linea;
	}
	
	public String pasarDecimal(String[] cadena) {
		int pot[]= {128,64,32,16,8,4,2,1};
		int suma=0;
		
		String cad[]=new String[4];
		
		for (int i=0; i<cadena.length; i++) {
			suma=0;
			for (int j=0; j<cadena[0].length(); j++) {
				if (cadena[i].charAt(j)=='1') {
					suma+=pot[j];
				}
			}
			cad[i]=suma+"";
		}
		
		return cad[0]+"."+cad[1]+"."+cad[2]+"."+cad[3];
	}
}
