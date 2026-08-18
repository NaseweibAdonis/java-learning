// Determine if a 3-digit number equals the sum of the cubes of its digits.

import java.util.Scanner;
public class ArmstrongNumber {

    static boolean isarmstrongNumber(int n){
        int temp = n;
        int rem = 0;
        double armstrongNumber = 0;


        while(n > 0){
            rem = n % 10;
            armstrongNumber = armstrongNumber + Math.pow(rem ,3);
            n = n / 10;
        }
        if(armstrongNumber == temp){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;

        if(isarmstrongNumber(n)){
            System.out.println("The number " + temp + " is a Armstrong Number");
        }
        else{
            System.out.println("The number " + temp + " is not a Armstrong Number");
        }
    }
    
}
