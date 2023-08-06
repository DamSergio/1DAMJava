package unidad3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	void testDistancia() {
		double resulE1=5;
		Calculadora calcu1=new Calculadora(10,5);
		double resulR1=calcu1.distancia();
		assertEquals(resulE1,resulR1,"kakita en .distancia1");
		
		double resulE2=5;
		Calculadora calcu2=new Calculadora(5,10);
		double resulR2=calcu2.distancia();
		assertEquals(resulE2,resulR2,"kakita en .distancia2");
	}

	@Test
	void testResta2() {
		Calculadora calcu1=new Calculadora(10,5);
		boolean resulR1=calcu1.resta2();
		assertTrue(resulR1,"kakita en .resta(2)1");
		
		Calculadora calcu2=new Calculadora(5,10);
		boolean resulR2=calcu2.resta2();
		assertFalse(resulR2,"kakita en .resta(2)2");
	}

	@Test
	void testDivide2() {
		Calculadora calcu1=new Calculadora(50,0);
		Integer resulR1=calcu1.divide2();
		assertNull(resulR1,"kakita en .divide(2)1");
		
		double resulE2=50;
		Calculadora calcu2=new Calculadora(50,1);
		double resulR2=calcu2.divide2();
		assertEquals(resulE2,resulR2,"kakita en .divide(2)2");
	}

}
