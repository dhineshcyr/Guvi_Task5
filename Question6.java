package task_5;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        // Taking inputs
	        int month = scanner.nextInt();
	        double rentPerDay = scanner.nextDouble();
	        int daysStayed = scanner.nextInt();

	        // Peak season months (April-June, November-December)
	        boolean isPeakSeason = switch (month) {
	            case 4, 5, 6, 11, 12 -> true;
	            default -> false;
	        };
 
	        // Calculate total tariff
	        double totalTariff = rentPerDay * daysStayed;
	        if (isPeakSeason) {
	            totalTariff *= 1.2; // Increase by 20% in peak season
	        }

	        // Print result formatted to 2 decimal places
	        System.out.printf("%.2f%n", totalTariff);

	        scanner.close();
	}

}
//output
//3
//1500
//2
//3000.00