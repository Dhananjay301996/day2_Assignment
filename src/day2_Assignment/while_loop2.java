package day2_Assignment;

import java.util.*;

public class while_loop2 {

	public static void main(String[] args) {
		
		System.out.println("Enter N number");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		
		int reverse = 0;  
		while(n != 0)   
		{  
		int remainder = n % 10;  
		reverse = reverse * 10 + remainder;  
		n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
