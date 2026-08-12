// Compute the GCD of two numbers using the Euclidean algorithm.

import java.util.Scanner;
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value A: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        int temp = 0;
        
        while(b != 0){

            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The is GCD: "+ a);
    }    
}
