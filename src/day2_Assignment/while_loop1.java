package day2_Assignment;

import java.util.*;

public class while_loop1 {

	public static void main(String[] args) {
		System.out.println("Enter N number");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();

		int sum = 0;
		int i = 1;
		
		

		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("The addition of Natural numbers = " + sum);

	}

}
