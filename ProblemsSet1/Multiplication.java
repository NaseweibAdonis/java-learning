// Take an integer N and print its multiplication table from 1 to 10.

import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Multiplication table of " + n );

        for(int i = 1; i <= 10; i++){
                System.out.println( n + " x " +  i + " = " + (n * i));
        }
    } 
}