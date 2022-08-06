package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamWorkTestCase {

	//instance variables declaration
	TeamWork teamWork;
	ArrayList<Person> tm;
	
	Person p1;
	Person p2;
	Person p3;
	Person p4;
	Person p5;
	
	LocalDate DOB1;
	LocalDate DOB2;
	LocalDate DOB3;
	LocalDate DOB4;
	LocalDate DOB5;
	
	//setUp
	@BeforeEach
	public void setUp() throws Exception {
		DOB1 = LocalDate.of(1976, 7, 2);
		DOB2 = LocalDate.of(1980, 11, 19);
		DOB3 = LocalDate.of(1986, 1, 27);
		DOB4 = LocalDate.of(1947, 3, 14);
		DOB5 = LocalDate.of(1945, 10, 22);
		
		p1 = new Person("Walter", "Laborde", DOB1);
		p2 = new Person("Lucas", "Laborde", DOB2);
		p3 = new Person("Silvi", "Mon", DOB3);
		p4 = new Person("Marta", "Laborde", DOB4);
		p5 = new Person("Horacio", "Laborde", DOB5);
		
		tm = new ArrayList<Person>();
		tm.add(p1);
		tm.add(p2);
		tm.add(p3);
		tm.add(p4);
		tm.add(p5);
		
		teamWork = new TeamWork().setNameTeamMembers("LClan", tm);
	
	}
		
	@Test
	//Test the amount of members in the collection
	void testTeamMembersSize() {
		assertEquals(teamWork.teamMembersAmount(),5);
	}
	
	@Test
	//test if the name of the teamwork is correct
	void testTeamWorkName() {
		assertEquals(teamWork.name(),"LClan");
	}
	
	@Test
	//Test the average age of team members
	void testAverageAgeTeamMembers() {
		assertEquals(teamWork.teamMembersAverageAge(),54.8);
	}
	

}
