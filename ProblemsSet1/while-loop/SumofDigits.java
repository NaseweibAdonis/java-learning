// Given a positive integer, calculate the sum of its digits using a while loop.

import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();

        int temp = num;

        int rem = 0;
        int sum = 0;

        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("The sum of " + temp + " is: " + sum);
    }
}
