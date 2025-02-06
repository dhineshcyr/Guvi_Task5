package task_5;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        scanner.close();
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if ((i + j) % 2 == 0)
	                    System.out.print("* ");
	                else
	                     System.out.print("  ");
	            }
	            System.out.println();
	}

	}
}
//output
//Enter a number: 5
//*   *   * 
//  *   *   
//*   *   * 
//  *   *   
//*   *   * 