package day2_Assignment;

import java.util.Scanner;

public class for_loop3 {

	public static void main(String[] args) {
		System.out.println("enter your number");

		int reverse = 0;
		int remainder = 0;
		int x = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		x=n;
		

		for (; n > 0; n = n / 10) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
		}
		if (x == reverse) {
			System.out.println("The number is palindrome number");
		} else {
			System.out.println("The number is not palindrome number");
		}

	}

}
