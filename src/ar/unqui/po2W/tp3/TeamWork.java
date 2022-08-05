package ar.unqui.po2W.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamWork {

	String name;
	List<Person> teamMembers = new ArrayList<Person>();
	
	//constructor
	public TeamWork(String teamWorkName, ArrayList<Person> teamMembers) {
		super();
		// this method avoids giving outside objects access to structure (instance variables)
		// thats why i use this method.
		this.setTeamWork(teamWorkName,teamMembers);
	}
	
	// this is the method used as the Creation Parameter Method
	private void setTeamWork(String teamWorkName, ArrayList<Person> teamMembers) {
		this.setName(teamWorkName);
		this.setTeamMembers(teamMembers);
	}

	// Getters and Setters
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private List<Person> getTeamMembers() {
		return teamMembers;
	}

	private void setTeamMembers(ArrayList<Person> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	private void addMember(Person p) {
		this.getTeamMembers().add(p);
	}
	
	// Public Visibility Methods
	
	// returns the name of the teamWork
	// i use this instead of giving access to getters
	String name() {
		return this.getName();
	}
	
	// calculates the average age of all members
	Double averageAgeTeamMembers() {
		Double averageAge = this.getTeamMembers()
				.stream()
				.collect(Collectors.averagingInt(tm -> tm.getAge()));
	    return averageAge;
	}
	
	
}
