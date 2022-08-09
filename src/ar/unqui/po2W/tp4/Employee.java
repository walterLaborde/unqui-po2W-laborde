package ar.unqui.po2W.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private Double taxRate;
	private List<Income> income = new ArrayList<Income>();
	
	
	//Constructor
	public Employee(Double taxRate, List<Income> income) {
		super();
		this.setTaxRate(taxRate);
		this.setIncome(income);
	}

	// private Getters and Setters
	private Double getTaxRate() {
		return taxRate;
	}

	private void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	private List<Income> getIncome() {
		return income;
	}

	private void setIncome(List<Income> income) {
		this.income = income;
	}
	
	//public methods
	
	public List<Income> income() {
		return this.getIncome();
	}
	
	public void addIncome(Income i) {
		this.getIncome().add(i);
	}
	
	public double taxRate() {
		return this.getTaxRate();
	}
	
	// all concepts income
	public double earnedIncome() {
		return this.getIncome()
				   .stream()
				   .collect(Collectors.summingDouble(i -> i.amount()));
	}
	
	//total income minus overtime income
	public double taxableIncome() {
		return this.getIncome()
				.stream()
			    .filter(i -> i.payFor().equals(Motive.MonthlySalary))
			    .mapToDouble(in -> in.amount())
			    .sum();
	}
	
	public double totalTaxPayable() {
		return this.taxableIncome() * this.taxRate();
	}
	
	
	
}
