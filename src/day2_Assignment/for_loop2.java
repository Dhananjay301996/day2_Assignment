package day2_Assignment;
import java.util.*;

public class for_loop2 {

	public static void main(String[] args) {
		System.out.println("enter your number");

		int reverse = 0;
		int remainder = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		for (; n > 0; n = n / 10) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
		}

		System.out.println("The reverse number is " + reverse);

	}

}
