package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperatorTestCase {
	// delare a multioperator type variable
	private Multioperator multioperator;

	@BeforeEach
	public void setUp() throws Exception {
	// create a Multioperator variable
		multioperator = new Multioperator();
	// add numbers to arrayList
		multioperator.add(2);
		multioperator.add(4);
		multioperator.add(6);
		multioperator.add(8);
		multioperator.add(10);
	}
	
/** 
 * it adds all the numbers in the array
 * */
	
	@Test
	void testmultioperatorAddition() {
		// getting the Multioperator sum
		int multiOpSum = multioperator.multioperatorAddition();
		// checking the results
		assertEquals(multiOpSum, 30);
	}

/** 
 * it adds all the numbers in the array
 * */
		
	@Test
	void testmultioperatorSubstraction() {
		// getting the Multioperator sum
		int multiOpSubs = multioperator.multioperatorSubstraction();
		// checking the results
		assertEquals(multiOpSubs, -30);
	}

/** 
 * it adds all the numbers in the array
 * */
			
	@Test
	void testmultioperatorMultiplication() {
		// getting the Multioperator sum
		int multiOpMult = multioperator.multioperatorMultiplication();
		// checking the results
		assertEquals(multiOpMult, 3840);
	}

}
