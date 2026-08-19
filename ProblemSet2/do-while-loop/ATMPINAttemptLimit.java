//Allow a user up to 3 attempts to enter the correct PIN before locking the account.

import java.util.Scanner;
public class ATMPINAttemptLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String original_password = sc.nextLine();
        String confirm_password = "";
        int counter = 1;

        do{
            System.out.print("Enter the password again: ");
            confirm_password = sc.nextLine();
            if(confirm_password.equals(original_password)){
                System.out.println("Yes The password is set successfully");
                break;
            }
            System.out.println("You have tried for " + counter + " out of 3 attempts");
            counter++;
            
        }while(counter < 4);
        sc.close();
    }

}
