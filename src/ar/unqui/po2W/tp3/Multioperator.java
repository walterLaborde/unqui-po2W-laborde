package ar.unqui.po2W.tp3;

import java.util.ArrayList;

public class Multioperator {
	private ArrayList<Integer> multioperator = new ArrayList<Integer>();
	
	//constructor
	public Multioperator() {
		super();
	}
	
	//Getter
	public ArrayList<Integer> getMultioperator() {
		return multioperator;
	}

	// sums all the numbers in the array
	int multioperatorAddition() {
		int sum = 0;
		ArrayList<Integer> l = this.getMultioperator();
		for(int i = 0; i<l.size(); i++) {
			sum = sum + l.get(i);
		}
		return sum;
	}
	
	// substract all the numbers in the array
	int multioperatorSubstraction() {
		int subst = 0;
		ArrayList<Integer> l = this.getMultioperator();
		for(int i = 0; i<l.size(); i++) {
			subst = subst - l.get(i);
		}
		return subst;
	}
	
	// Multiplicates all the numbers in the array
	int multioperatorMultiplication() {
		int mult = 1;
		ArrayList<Integer> l = this.getMultioperator();
		for(int i = 0; i<l.size(); i++) {
			mult = mult * l.get(i);
		}
		return mult;
	}
	
	// adds an element to Multioperator array
	public void add(int i) {
		this.getMultioperator().add(i);
	}
}
