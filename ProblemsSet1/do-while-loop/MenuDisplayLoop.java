// Display a simple options menu at least once and re-display it until the user selects 0 to exit.

import java.util.Scanner;
public class MenuDisplayLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{

            System.out.println("1. Apple");
            System.out.println("2. Banana");
            System.out.println("3. Carrot");
            System.out.println("4. Egg");
            System.out.println("5. Chicken");
            System.out.println("6. Oil");
            System.out.println("7. Beans");
            System.out.println("0. Exit");

            System.out.print("Enter the number: ");
            n = sc.nextInt();

        }while(n != 0);
        System.out.println("Exit");
        sc.close();
    }
}
