// Compute N! for a given integer N

import java.util.Scanner;
public class FactorialofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int factorial = 1;

        for(int i = 1; i <= n; i++){

            factorial *= i;
        }
        System.out.println("The Factorial of the value " + n + " is: "+ factorial);
        sc.close();
    }
}
