// Perform addition, subtraction, multiplication, or division based on an operator character (+, -, *, /).

import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the first operand: ");
        int num1 = sc.nextInt();

       System.out.print("Enter the second operand: ");
        int num2 = sc.nextInt();

        
        if(operator == '+'){
            int sum = num1 + num2;
            System.out.println("The Sum of " +num1 + " and " + num2 + " is: " + sum);
        }
        else if(operator == '-'){
            int difference = num1 - num2;
            System.out.println("The Sum of " +num1 + " and " + num2 + " is: " + difference);
        }
        else if(operator == '*'){
            int product = num1 * num2;
            System.out.println("The Sum of " +num1 + " and " + num2 + " is: " + product);
        }
        else if(operator == '/'){
            int division = num1 / num2;
            System.out.println("The Sum of " +num1 + " and " + num2 + " is: " + division);
        }
        else if(operator == '%'){
            int remainder = num1 % num2;
            System.out.println("The Sum of " +num1 + " and " + num2 + " is: " + remainder);
        }
        else{
            System.out.println("Not valid");
        }
        sc.close();
    }
    
}
