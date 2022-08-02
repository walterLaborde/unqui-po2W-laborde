package ar.unqui.po2W.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamWork {

	String name;
	List<Person> teamMembers = new ArrayList<Person>();
	
	//constructor
	public TeamWork(String name, ArrayList<Person> teamMembers) {
		super();
		this.setName(name);
		this.setTeamMembers(teamMembers);
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(ArrayList<Person> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	public void addMember(Person p) {
		this.getTeamMembers().add(p);
	}
	
	// calculates the average age of all members
	public Double averageAgeTeamMembers() {
		Double averageAge = this.getTeamMembers()
				.stream()
				.collect(Collectors.averagingInt(tm -> tm.getAge()));
	    return averageAge;
	}
	
	
}
