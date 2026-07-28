// Keep prompting the user for input until they provide a strictly positive integer.

import java.util.Scanner;
public class PositiveNumberEnforcer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do{
            System.out.print("Enter the number: ");
            n = sc.nextInt();
        }while(n <= 0);
        System.out.println("Exit");
        sc.close();
    }
}
