// Check if an integer reads the same forwards and backwards (e.g., 121).

import java.util.Scanner;
public class PalindromeNumberChecker {

   static void palindromeNumberChecker(int n){
        int temp = n;
        int rem = 0;
        int rev = 0;

        while(n > 0){

            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(rev == temp){
            System.out.println("The number is " +temp + " Palindrome");
        }
        else{
            System.out.println("The number is " + temp + " not a Palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        palindromeNumberChecker(n);
    }
    
}
