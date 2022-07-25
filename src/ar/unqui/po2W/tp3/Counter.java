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
	
	// returns the number with the most of even digits from an int array
	int getMostEvenDigitsNumber(ArrayList<Integer> l) {
		int mostEvenDigits = 0;
		//ArrayList<Integer> ls = l;
		for(int i = 0; i<l.size(); i++) {
			if(this.getMostEvenDigits(l.get(i)) > this.getMostEvenDigits(mostEvenDigits)) {
				mostEvenDigits = l.get(i);
			}
		}
		return mostEvenDigits;
	}

	// gets the amount of even digits of a given number
	private int getMostEvenDigits(int i) {
		int evenDigitsAmount = 0;
		int intDivision = i;
		while(intDivision>0) {
			if(this.isEven(intDivision%10)) {
				evenDigitsAmount++;
			}
			intDivision = intDivision/10;
		}
		return evenDigitsAmount;
	}
	
	// indicates if a given number is even
	private boolean isEven(int i) {
		return i%2==0;
	}
	
	// returns the highest 
	int getHighestMultipleOf(int x, int y) {
		int commonMult = 1000;
		int highestMult = this.getTheHighestMult(commonMult);
		while((commonMult > 0) 
				&& 
			!((commonMult%x == 0) && (commonMult%y == 0))) { 
			commonMult--; 
		}
		return highestMult;
	}
	
	private int getTheHighestMult(int i) {
		if(i == 0) {
			return -1;
		}
		else {
			return i;
		}
	}
	
	// esta mal... siempre estoy devolviendo -1... tengo que corregir

	// -------------------------------------------------------
	
	
	// Ejercicio 4 - Examinar las expresiones
	
	String a = "abc";
	String s = a;
	String t;


}


