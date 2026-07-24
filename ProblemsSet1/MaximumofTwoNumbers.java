import java.util.Scanner;
public class MaximumofTwoNumbers {
    
    static void maximum(int num1 , int num2){
            if(num1 > num2){
                System.out.println(num1 + " is Greater than " + num2);
            }
            else if(num1 == num2){
                System.out.println(num1 + " is Equal " + num2);
            }
            else{
                System.out.println( num2 + " is Greater than " + num1);
            }

        }
            public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the value: ");
                int num1 = sc.nextInt();

                System.out.print("Enter the value: ");
                int num2 = sc.nextInt();

                maximum(num1, num2);
            
    }

}
