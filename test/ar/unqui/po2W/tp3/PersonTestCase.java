package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTestCase {

	//instance variables declaration
	Person person1;
	Person person2;

	LocalDate DOB1;
	LocalDate DOB2;
	
	//setUp
	@BeforeEach
	public void setUp() throws Exception {

		DOB1 = LocalDate.of(1976, 7, 2);
		DOB2 = LocalDate.of(1986, 1, 27);
		person1 = new Person("Waldo", DOB1);
		person2 = new Person("Silvi", DOB2);
	}
	
	@Test
	void testGetName() {
		assertEquals(person1.getName(),"Waldo");
		assertEquals(person2.getName(),"Silvi");
	}
	
	
	@Test
	void testGetAge() {
		assertEquals(person1.getAge(),46);
		assertEquals(person2.getAge(),36);
	}
	
	
	@Test
	void testYoungerThan() {
		assertFalse(person1.isYoungerThan(person2));
		assertTrue(person2.isYoungerThan(person1));
	}


}
