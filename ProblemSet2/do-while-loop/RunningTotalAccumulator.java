// Keep adding user-entered numbers to a total until a negative number is entered.

import java.util.Scanner;
public class RunningTotalAccumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        do{
        System.out.print("Enter a number: ");
         n = sc.nextInt();
         if(n > 0){
         sum += n;
         }

        }while(n > 0);
        System.out.println(sum);
    }
    
}