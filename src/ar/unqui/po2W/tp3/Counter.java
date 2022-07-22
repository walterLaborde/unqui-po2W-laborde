package ar.unqui.po2W.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> counter = new ArrayList<Integer>();
	
	// constructor
	public Counter() {
		super();
	}
	
	// add i to ArrayList
	public void addNumber(int i) {
		// TODO Auto-generated method stub
		this.getCounter().add(i);
	}
	
	private ArrayList<Integer> getCounter() {
		// TODO Auto-generated method stub
		return counter;
	}

	// count of even number ocurrences
	int getEvenOcurrences() {
		int evenCount = 0;
		ArrayList<Integer> l = this.getCounter();
		for(int i = 0; i<l.size(); i++) {
			if(l.get(i)%2 == 0) {evenCount++;}
		}
		return evenCount;
	}
	
	// count of odd number ocurrences
	int getOddOcurrences() {
		int oddCount = 0;
		ArrayList<Integer> l = this.getCounter();
		for(int i = 0; i<l.size(); i++) {
			if(l.get(i)%2 != 0) {oddCount++;}
		}
		return oddCount;
	}
	
	// count of multiple numbers of "multiple".
	int getMultipleOcurrences(int multiple) {
		int multipleCount =0;
		ArrayList<Integer> l = this.getCounter();
		for(int i = 0; i<l.size(); i++) {
			if(l.get(i)%multiple == 0) {multipleCount++;}
		}
		return multipleCount;
	}
}
