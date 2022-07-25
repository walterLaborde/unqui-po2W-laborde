package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
/**
* Verifica la cantidad de pares
*/

	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
	// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
/**
* Verifica la cantidad de impares
*/

	@Test
	public void testOddNumbers() {
	// Getting the even occurrences
		int amount = counter.getOddOcurrences();
	// I check the amount is the expected one
		assertEquals(amount, 9);
		}
	
/**
* Verifica la cantidad de multiplos
*/

	@Test
	public void testMultipleNumbers() {
	// Getting the multiple occurrences
		int amount = counter.getMultipleOcurrences(3);
	// I check the amount is the expected one
		assertEquals(amount, 2);
	}

	
/**
* Verifica el numero con mayor cantidad de digitos pares
*/


	@Test
	public void testEvenDigitsOfNumbersFromIntArr() {
	// declaring ArrayList 
		ArrayList<Integer> intArr = new ArrayList<Integer>(); 
	// adding numbers to the array
		intArr.add(7184);
		intArr.add(539412668);
		intArr.add(11);
		intArr.add(239);
	// Getting the most even digits from ArrayList
		int mostEvenNum = counter.getMostEvenDigitsNumber(intArr);
	// I check the amount is the expected one
		assertEquals(mostEvenNum, 539412668);
	}

/**
* Verifica el maximo comun multiplo de dos numeros
*/

	@Test
	public void testGetHighestMultipleOf() {
	// declaring ints 
		int int1 = 3;
		int int2 = 9;
	// Getting the highest common multiple of int1 and int2
		int commonMultipleOf = counter.getHighestMultipleOf(int1,int2);
	// I check the amount is the expected one
		assertEquals(commonMultipleOf, 999);
	}
	
	
/**
* Verifica el maximo comun multiplo de dos numeros
*/

	@Test
	public void testStringsOperations() {
	// i declare some variables
		String a = "abc";
		String s = a;
		String t;
	// I check the amount is the expected one
		assertEquals(s.length(), 3);
		//assertEquals(t.length(), null);
		assertEquals(1 + a, "1abc");
		assertEquals(a.toUpperCase(), "ABC");
		assertEquals("Libertad".indexOf("r"), 4);
		assertEquals("Quilmes".substring(2,4), "il");
		assertEquals((counter.a.length() + counter.a).startsWith("a"), false);
		assertEquals(counter.s == counter.a, true);
		assertEquals(counter.a.substring(1,3).equals("bc"), true);
		
	}
	

}
