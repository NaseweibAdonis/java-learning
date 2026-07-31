// Calculate tax based on progressive income tiers (0–5k: 0%, 5k–10k: 10%, >10k: 20%).

import java.util.Scanner;
public class IncomeTaxSlab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Income: ");
        double income = sc.nextDouble();

        if(income <= 5000){
            System.out.println("Your Tax is: "+income);
        }
        else if(income >= 5000 && income <= 10000){
            System.out.println("Your Tax is: "+ (income * (10.0 / 100.0) ));
        }
        else{
            System.out.println("Your Tax is: "+ (income * (20.0/ 100.0 ) ));
        }
        sc.close();
    }
}
