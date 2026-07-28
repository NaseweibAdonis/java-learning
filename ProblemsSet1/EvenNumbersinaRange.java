// Print all even numbers between 1 and 20 using a for loop.

import java.util.Scanner;
public class EvenNumbersinaRange {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value to find the even numbers: ");
            int n = sc.nextInt();

             System.out.println("The even numbers are: ");
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                   System.out.println(i);
                }
            }
    }
}
