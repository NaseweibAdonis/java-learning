// Keep looping and reading integer inputs until the user enters the number 7.

import java.util.Scanner;
public class GuessingTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0; 


        while(n != 7){
        System.out.print("Enter the value: ");
        n = sc.nextInt();
        if(n == 7){
            System.out.println("Congratulations");
            break;
        }
        }
        sc.close();

    }

}
