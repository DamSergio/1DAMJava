package unidad3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		
		double resulEsperado=17;
		Calculadora calcu1=new Calculadora(10,7);
		double resulReal=calcu1.suma();
		
		assertEquals(resulEsperado, resulReal, "kakita en la .suma");
	}

	@Test
	void testResta() {

		double resulEsperado=3;
		Calculadora calcu1=new Calculadora(10,7);
		double resulReal=calcu1.distancia();
		
		assertEquals(resulEsperado, resulReal, "kakita en la .resta");
	}

	@Test
	void testMultiplica() {

		double resulEsperado=7;
		Calculadora calcu1=new Calculadora(10,7);
		double resulReal=calcu1.multiplica();
		
		assertEquals(resulEsperado, resulReal, "kakita en la .multiplica");
	}

	@Test
	void testDivide() {

		double resulEsperado=5;
		Calculadora calcu1=new Calculadora(10,2);
		double resulReal=calcu1.divide();
		
		assertEquals(resulEsperado, resulReal, "kakita en la .divide");
	}

}
