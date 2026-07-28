import java.util.Scanner;

// if-else
class EvenorOddChecker {

    static boolean isEvenOrOdd(int n ){

        if( n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
     void main(){

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