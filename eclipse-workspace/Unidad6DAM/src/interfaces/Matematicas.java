package interfaces;

import java.util.Arrays;

public class Matematicas implements MathArray{

	public int factorial(int n) {
		int fact=n;
		for (int i=n; i>0; i--) {
			n--;
			fact+=n;
		}
		return fact;
	}
	
	public int random(int n) {
		return (int)(1+Math.random()*n);
	}

	@Override
	public int min(int[] array) {
		Arrays.sort(array);
		return array[0];
	}

	@Override
	public int max(int[] array) {
		int max=array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}

	@Override
	public int sum(int[] array) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Matematicas m=new Matematicas();
		int array[]={9,12,3,4,5,6,7};
		
		System.out.println(Arrays.toString(array));
		System.out.println("Factorial: "+m.factorial(3));
		System.out.println("Random: "+m.random(7));
		System.out.println("Minimo: "+m.min(array));
		System.out.println("Maximo: "+m.max(array));
		System.out.println("Suma: "+m.sum(array));
		
		double array2[]={4.4,3.6};
		System.out.println(m.max(array2));
	}

	@Override
	public double min(double[] array) {
		Arrays.sort(array);
		return array[0];
	}

	@Override
	public double max(double[] array) {
		double max=array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}

	@Override
	public double sum(double[] array) {
		double sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
}
