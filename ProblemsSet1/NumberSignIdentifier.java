import java.util.Scanner;
public class NumberSignIdentifier {
    
    static void numberSignIdentifier(int number){
        if(number < 0){
            System.out.println("Negative");
        }
        else if(number == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Positive");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        numberSignIdentifier(number);
    }
}
