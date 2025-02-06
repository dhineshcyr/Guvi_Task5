package task_5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        scanner.close();
	        
	        int num = 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                 num++;
	            }
	            System.out.println();
	        }
	}

}
//output
//Enter a number: 4
//1 
//2 3 
//4 5 6 
//7 8 9 10 
