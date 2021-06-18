package javaPrograms;

import java.util.Scanner;

public class Utility {
	private static final Scanner sc = new Scanner(System.in);
	public static double getRandomDouble() {
		return Math.random();
	}
	
	public static int getUserSpecificInteger() {
		return sc.nextInt();
	}
	public static char getUserSpecificChar() {
		return sc.next( ).charAt(0);
	}
	public static double getUserSpecificDouble() {
		return sc.nextDouble();
	}
}
