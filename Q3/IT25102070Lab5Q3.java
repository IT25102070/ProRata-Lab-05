import java.util.Scanner;

public class IT25102070Lab5Q3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDays = endDate - startDate;

        double totalAmount = ROOM_CHARGE_PER_DAY * numberOfDays;

        if (numberOfDays >= 5) {
            totalAmount = totalAmount - (totalAmount * DISCOUNT_20);
        }
        else if (numberOfDays >= 3) {
            totalAmount = totalAmount - (totalAmount * DISCOUNT_10);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
		
		input.close();
    }
	
	
}