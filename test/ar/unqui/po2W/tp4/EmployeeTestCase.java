package ar.unqui.po2W.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTestCase {

	Employee employee;
	
	Income income1m;
	Income income2m;
	Income income3m;
	Income income4m;
	
	Income income1o;
	Income income2o;
	Income income3o;
	
	ArrayList<Income> employeeIncomes;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		income1m = new Income(Month.Jan, Motive.MonthlySalary, 30000d);
		income2m = new Income(Month.Feb, Motive.MonthlySalary, 32000d);
		income3m = new Income(Month.Mar, Motive.MonthlySalary, 32000d);
		income4m = new Income(Month.Apr, Motive.MonthlySalary, 34000d);
		
		income1o = new Income(Month.Jan, Motive.Overtime, 4500d, 9d);
		income2o = new Income(Month.Mar, Motive.Overtime, 5500d, 11d);
		income3o = new Income(Month.Apr, Motive.Overtime, 6000d, 12d);
		
		employeeIncomes = new ArrayList<Income>();
		
		employeeIncomes.add(income1m);
		employeeIncomes.add(income1o);
		employeeIncomes.add(income2m);
		employeeIncomes.add(income3m);
		employeeIncomes.add(income2o);
		employeeIncomes.add(income4m);
		employeeIncomes.add(income3o);
		
		employee = new Employee(0.02d, employeeIncomes);
		
	}
	
	@Test
	void incomeTest() {
		List<Income> incomes = Arrays.asList(income1m,income1o,income2m,income3m,income2o,income4m,income3o);
		assertEquals(employee.income(),incomes);
	}
	
	@Test
	void earnedIncomeTest() {
		assertEquals(144000d,employee.earnedIncome());
	}
	
	@Test
	void taxableIncomeTest() {
		assertEquals(128000d,employee.taxableIncome());
	}
	
	@Test
	void totalTaxPayableTest() {
		assertEquals(2560d,employee.totalTaxPayable());
	}

}
