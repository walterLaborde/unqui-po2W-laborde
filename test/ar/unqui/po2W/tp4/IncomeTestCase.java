package ar.unqui.po2W.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IncomeTestCase {

	// generate variables
	Income income;
	
	@BeforeEach
	public void setUp() throws Exception {
		income = new Income(Month.Jan, Motive.MonthlySalary, 30000d);
	}
	
	@Test
	void amountTest() {
		assertEquals(30000d,income.amount());
	}

}
