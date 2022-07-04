package day2_Assignment;

import java.util.*;

public class if_else2 {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int x = number.nextInt();

		if (x == 1) {
			System.out.println("Unit");
		} else if (x == 10) {
			System.out.println("Ten");
		} else if (x == 100) {
			System.out.println("Hundred");
		} else if (x == 1000) {
			System.out.println("Thousand");
		} else {
			System.out.println("Please enter a valid number");
		}

	}

}
