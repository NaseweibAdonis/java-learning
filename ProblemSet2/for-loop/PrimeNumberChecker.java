// Determine whether a given integer N is a prime number.

import java.util.Scanner;
public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        boolean isPrime = true;
        
        for(int i = 2; i < n; i++){
            
                if (n % i == 0){
                    isPrime = false;
                    break;
                
            }
        }

        if(n <= 0){
            System.out.println("Enter a number greater than 1");
            
        }
       else if(n == 1){
            System.out.println("Neither Prime nor Composite");
            
       } 
    
      else if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
            
        
        sc.close();
    }
}

 //Printing prime numbers in a range
 /* 
       for(int i = 2; i <= n; i++){
        boolean isPrime = true;
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(i);
        }
       }
        */