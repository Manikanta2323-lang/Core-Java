package conditions;

import java.util.Scanner;

public class FeeCalculator {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input: Grade, Base Fee, Academic Topper Status
        System.out.print("Enter student's grade (1-12): ");
        int grade = in.nextInt();

        System.out.print("Enter base tuition fee: ");
        double baseFee = in.nextDouble();

        in.nextLine(); // Consume the newline
        System.out.print("Is the student an academic topper? (yes/no): ");
        String isTopperInput = in.nextLine().toLowerCase();
        boolean isTopper = isTopperInput.equals("yes");

        double discountPercent = 0;

        // Determine base discount
        if (grade >= 9 && grade <= 12) {
            discountPercent = isTopper ? 20 : 10;
        } else if (grade >= 6 && grade <= 8) {
            discountPercent = 5;
        } else if (grade < 6) {
            discountPercent = 0;
        }

        // Additional discounts
        if (grade == 10) {
            discountPercent += 3;
        } else if (grade == 12) {
            discountPercent += 5;
        }else{
            discountPercent+=0;
        }


        // Calculate amounts
        double discountAmount = (discountPercent / 100) * baseFee;
        double feeToPay = baseFee - discountAmount;

        // Display output
        System.out.println("\n--- Tuition Fee Details ---");
        System.out.println("Student Grade       : " + grade);
        System.out.printf("Base Tuition Fee    : $%.2f\n", baseFee);
        System.out.println("Discount Percentage : " + discountPercent + "%");
        System.out.printf("Discount Amount     : $%.2f\n", discountAmount);
        System.out.printf("Fee to Pay          : $%.2f\n", feeToPay);

        
    }

}
