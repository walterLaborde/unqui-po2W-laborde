package ar.unqui.po2W.tp3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {

	//the name of the person
	private String name;
	// the date of birth
	LocalDate DOB = null;
	
	// constructor using fields
	public Person(String name, LocalDate dOB) {
		super();
		this.setName(name);
		this.setDOB(dOB);
	}

	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	// the person's age
	public int getAge() {
		//Clock clock = Clock.systemDefaultZone();
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(this.DOB,currentDate);
		return age.getYears();
		
	}
	
	// determines whether the actual person is younger than the one received by parameter
	public boolean isYoungerThan(Person person) {
		return this.getAge() < person.getAge();
	}
}
