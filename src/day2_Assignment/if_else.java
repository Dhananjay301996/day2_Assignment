package day2_Assignment;

import java.util.*;

public class if_else {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int x = number.nextInt();

		if (x == 0) {
			System.out.println("The number is ZERO");
		} else if (x == 1) {
			System.out.println("The number is ONE");
		} else if (x == 2) {
			System.out.println("The number is TWO");
		} else if (x == 3) {
			System.out.println("The number is THREE");
		} else if (x == 4) {
			System.out.println("The number is FOUR");
		} else if (x == 5) {
			System.out.println("The number is FIVE");
		} else if (x == 6) {
			System.out.println("The number is SIX");
		} else if (x == 7) {
			System.out.println("The number is SEVEN");
		} else if (x == 8) {
			System.out.println("The number is EIGHT");
		} else if (x == 9) {
			System.out.println("The number is NINE");
		} else {
			System.out.println("You Entered Wrong Number");
		}
	}

}
