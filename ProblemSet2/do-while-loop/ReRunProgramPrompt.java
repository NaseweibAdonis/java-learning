// Run a calculation, then ask "Do you want to continue? (1 for Yes,O for No)" at least once.

import java.util.Scanner;
public class ReRunProgramPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;
        int a , b = 0; 
        char ch = ' ';
        do{
            System.out.print("Enter the value for a: ");
            a = sc.nextInt();
            System.out.print("Enter the value for b: ");
            b = sc.nextInt();
            operation = a * b;
            System.out.println("Operation (a * b): " + operation);

            System.out.print("Do you want to continue? (1 for Yes,O for No): ");
            ch = sc.next().toLowerCase().charAt(0);
            
        }while(ch != 'n');
        System.out.println("Okay Thank you");
    }
    
}