package day2_Assignment;

import java.util.*;

public class for_loop1 {

	public static void main(String[] args) {
		System.out.println("Enter N number");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int i,sum = 0;  
		 
		for(i = 1; i <= n; ++i)  
		{   
		sum = sum + i;  
		}  
		 
		System.out.println("Sum of Natural Numbers is = " + sum);  
	}

}
