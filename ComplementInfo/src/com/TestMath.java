package com;

public class TestMath {
	public static void testFactorielle() {
		System.out.println("TEST FACTORIELLE");
		int n = 8;
		System.out.println("factorielle(" + n + ") = " + Math.factorielle(n));
		System.out.println("---------------------------");
	}
	
	public static void testFibonacci() {
		System.out.println("TEST FIBONACCI");
		int n = 13;
		System.out.println("fibonacci(" + n + ") = " + Math.fibonacci(n));
		System.out.println("---------------------------");
	}
	
	public static void test() {
		testFactorielle();
		testFibonacci();
	}
}
