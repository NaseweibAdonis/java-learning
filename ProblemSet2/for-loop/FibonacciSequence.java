import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int first_term = 0;
        int second_term = 1;

        int fibo = 0;

        System.out.print(first_term + " " + second_term + " ");
        for(int i = 1; i <= n - 2; i++){
             fibo = first_term + second_term;
             System.out.print(fibo + " ");
             first_term = second_term;
             second_term = fibo;
        }
        
        
        }
    
    
    }
    

