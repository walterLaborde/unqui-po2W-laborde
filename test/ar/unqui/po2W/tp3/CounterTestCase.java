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
* Verifica la cantidad de multiplos
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


}
