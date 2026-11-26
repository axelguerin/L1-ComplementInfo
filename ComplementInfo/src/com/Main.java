package com;
import java.util.ArrayList;

public class Main {
	
	public static int factorielle(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorielle(n - 1);
		}
	}
	
	public static void factorielle() {
		
	}
	
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static void testFibonacci() {
		
	}
	
	public static int somme(ArrayList<Integer> liste) {
		if (liste.isEmpty()) {
			return 0;
		} else {
			int e = liste.getFirst();
			liste.removeFirst();
			return e + somme(liste);
		}
	}
	
	public static void testSomme() {
		
	}
	
	public static ArrayList<Integer> concat(
			ArrayList<Integer> listeA, 
			ArrayList<Integer> listeB
		) {
		if (listeB.isEmpty()) {
			return listeA;
		} else {
			int e = listeB.getFirst();
			listeB.removeFirst();
			listeA.add(e);
			return concat(listeA, listeB);
		}
	}
	
	public static void testConcat() {
		ArrayList<Integer> listeA = new ArrayList<>();
		listeA.add(5);
		listeA.add(3);
		listeA.add(7);
		listeA.add(1);
		ArrayList<Integer> listeB = new ArrayList<>();
		listeB.add(2);
		listeB.add(9);
		System.out.println("listeA = " + listeA);
		System.out.println("listeB = " + listeB);
		System.out.println("concat(listeA, listeB) = " + concat(listeA, listeB));
	}

	public static void main(String[] args) {
		testConcat();
	}

}
