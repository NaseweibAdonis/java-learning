// Print a right-angled triangle pattern of asterisks (*) of height N.

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the value of N: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
       
    }
    
}

