package com;

import java.util.ArrayList;

public class TestListe {
	public static void testSomme() {
		System.out.println("TEST SOMME");
		ArrayList<Integer> liste = new ArrayList<>();
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(8);
		System.out.println("liste = " + liste);
		System.out.println("somme(liste) = " + Liste.somme(liste));
		System.out.println("---------------------------");
	}
	
	public static void testConcat() {
		System.out.println("TEST CONCAT");
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
		System.out.println("concat(listeA, listeB) = " + Liste.concat(listeA, listeB));
		System.out.println("---------------------------");
	}
	
	public static void test() {
		testSomme();
		testConcat();
	}
}
