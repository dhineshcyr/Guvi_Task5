package task_5;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        // Taking input string
	         String str = scanner.nextLine();
  
	        // Reversing the string using StringBuilder
	        String reversedStr = new StringBuilder(str).reverse().toString();

	        // Using ternary operator instead of if-else
	        System.out.println(str.equals(reversedStr) ? "Palindrome" : "Not a Palindrome");

	        scanner.close();
	            }

	     }
//output
//ngixn
//Not a Palindrome
