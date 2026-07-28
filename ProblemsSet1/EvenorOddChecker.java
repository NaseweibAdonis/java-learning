//Take an integer input and print whether it is even or odd using the modulus operator (%).

import java.util.Scanner;
class EvenorOddChecker {

    static boolean isEvenOrOdd(int n ){

        if( n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if(isEvenOrOdd(n)){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }
    }
}