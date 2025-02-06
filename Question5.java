package task_5;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter marks: ");
	        int marks = scanner.nextInt();
	        scanner.close();

	        if (marks > 100) {
	            System.out.println("Invalid Input");
	        } else if (marks == 100) {
	            System.out.println("S");
	        } else if (marks >= 90) {
	            System.out.println("A");
	        } else if (marks >= 80) {
	            System.out.println("B");
	        } else if (marks >= 70) {
	            System.out.println("C"); 
	        } else if (marks >= 60) {
	            System.out.println("D");
	        } else if (marks >= 50) {
	            System.out.println("E");
	        } else {
	            System.out.println("F");
	}

}}
//output
//Enter marks: 92
//A

//Enter marks: 75
//C
