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
	
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<>();
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		System.out.println(liste);
	}

}
