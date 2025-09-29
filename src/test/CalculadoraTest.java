package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;


class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception { //una sola vez
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception { //una sola vez
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception { // se ejecuta antes de las pruebas (con cada prueba)
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception { //se ejecuta despues de las pruebas (con cada prueba)
		System.out.println("After Each");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testSuma() {
		int valorEsperado = 3;
		int valorReal = Calculadora.suma(1, 2);
		
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testResta() {
		int valorEsperado = 3;
		int valorReal = Calculadora.resta(5, 2);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testMultiplica() {
		int valorEsperado = 4;
		int valorReal = Calculadora.multi(2, 2);
		
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testDivide() {
		int valorEsperado = 1;
		int valorReal = Calculadora.dividir(2, 2);
		
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testDivideEntreCero() {
		int valorEsperado = -1;
		int valorReal = Calculadora.dividir(2, 0);
		
		assertEquals(valorEsperado, valorReal);
	}
}
