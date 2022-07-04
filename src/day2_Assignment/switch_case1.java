package day2_Assignment;
import java.util.*;

public class switch_case1 {

	public static void main(String[] args) {
		System.out.println("Enter an letter");
		Scanner letter = new Scanner(System.in);
		
		char check = letter.next().charAt(0);

		switch (check) {
		case ('a' | 'A'):
			System.out.println("this letter is vowel");
			break;
		case ('e' | 'E'):
			System.out.println("this letter is vowel");
			break;
		case ('i' | 'I'):
			System.out.println("this letter is vowel");
			break;
		case ('o' | 'O'):
			System.out.println("this letter is vowel");
			break;
		case ('u' | 'U'):
			System.out.println("this letter is vowel");
			break;
		default:
			System.out.println("this letter is consonant");
			break;
		}

	}

}
