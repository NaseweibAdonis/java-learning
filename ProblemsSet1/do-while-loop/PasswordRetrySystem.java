// Prompt the user for a secret PIN at least once, repeating until the correct PIN is entered.
import java.util.Scanner;
public class PasswordRetrySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original_password , password;

        System.out.print("Enter the password: ");
            original_password = sc.next();

        do{
            System.out.print("Enter the password: ");
            password = sc.next();

        }while ( !(password.equals(original_password) ));
        System.out.println("Exit ");
        
        sc.close();
    }
    
}
