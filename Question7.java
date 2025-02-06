package task_5;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Finding the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Printing the result
        System.out.println(largest);
   
        scanner.close();

	}

}
//output
//15
//27
//10
//27