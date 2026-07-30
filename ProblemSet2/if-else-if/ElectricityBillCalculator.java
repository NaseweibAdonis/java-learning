// Calculate total bill based on units consumed: 0–100 units ($1/unit), 101–200 ($2/unit), >200 ($3/unit).

import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Units consumed: ");
        int units = sc.nextInt();

        if(units > 0 && units <= 100){
            System.out.println("Total Bill for the Units " + units + " is: " + units * 1);
        }
        else if(units > 100 && units <= 200){
            System.out.println("Total Bill for the Units " + units + " is: " + units * 2);
        }
        else{
            System.out.println("Total Bill for the Units " + units + " is: " + units * 3);
        }
        sc.close();
    }
    
}
