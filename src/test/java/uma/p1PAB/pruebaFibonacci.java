package uma.p1PAB;


import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class pruebaFibonacci{
	
	
	private Fibonacci fibonacci;
	
	//Inicializamos
	
	@Before
	public void init() {
		fibonacci = new Fibonacci();
	}
	
	//Buen funcionamiento de FIBONACCI
	
	@Test
	public void shouldFibonacciOfThreeReturnTwo() {
	    int result = fibonacci.compute(3,1);
	    int expectedResult = 2;

	    assertEquals(expectedResult, result);
	}
	
	
	@Test
	public void shouldFibonacciOfFourReturnFive() {
	    int result = fibonacci.compute(4,1);
	    int expectedResult = 3;

	    assertEquals(expectedResult, result);
	}
	
	
	@Test
	public void shouldFibonacciOf5Return5() {
	    int result = fibonacci.compute(5,1);
	    int expectedResult = 5;

	    assertEquals(expectedResult, result);
	}
	
	//CASOS ESPECIALES
	
	//==0
	
	@Test
	public void shouldFibonacciOfZeroReturnZero() {
	    int result = fibonacci.compute(0,1);
	    int expectedResult = 0;

	    assertEquals(expectedResult, result);
	}
	
	//Si repetimos la misma prueba aumenta el coverage ?
	@Test
	public void shouldFibonacciOfZero1ReturnZero() {
	    int result = fibonacci.compute(0,1);
	    int expectedResult = 0;

	    assertEquals(expectedResult, result);
	}
	
	//==1
	
	@Test
	public void shouldFibonacciOfOneReturnOne() {
	    int result = fibonacci.compute(1,1);
	    int expectedResult = 1;

	    assertEquals(expectedResult, result);
	}
	
	//Si repetimos la misma prueba aumenta el coverage ?
	
	@Test
	public void shouldFibonacciOfOne1ReturnOne() {
	    int result = fibonacci.compute(1,1);
	    int expectedResult = 1;

	    assertEquals(expectedResult, result);
	}
	
	@Test
	public void shouldFibonacciPRUEBA() {
	    int result = fibonacci.compute(5,3);
	    int expectedResult = 19;

	    assertEquals(expectedResult, result);
	}
	
	//<1 --> ERROR
	@Test (expected = RuntimeException.class)
	public void shouldFibonacciOfANegativeMonthRaiseException() {
	    fibonacci.compute(-1,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void shouldFibonacciOfANegativePairRaiseException() {
	    fibonacci.compute(1,-2);
	}
	/*
	@Test (expected = RuntimeException.class)
	public void shouldFibonacciOfANegative2PairRaiseException() {
	    fibonacci.compute(1,-5);
	}
	
	@Test (expected = RuntimeException.class)
	public void shouldFibonacciOfANegative3PairRaiseException() {
	    fibonacci.compute(1,-2);
	}
	
	*/
	//Finalmente vamos a añadir la prueba para comprobar la función rabbitRecurrence

	
	

	//Reinicializamos
	@After
	public void teardown() {
	    fibonacci = null ;
	}
	


}
