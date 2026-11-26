package com;

import java.util.ArrayList;

public class Liste {
	public static int somme(ArrayList<Integer> liste) {
		if (liste.isEmpty()) {
			return 0;
		} else {
			int e = liste.getFirst();
			liste.removeFirst();
			return e + somme(liste);
		}
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
}
