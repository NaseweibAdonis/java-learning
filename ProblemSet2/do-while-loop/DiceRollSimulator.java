//Simulate rolling a 6-sided die until a 6 appears, counting total attempts.

import java.util.Scanner;
import java.util.Random;
public class DiceRollSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int attempt = 0;
        int value = 0;
        char ch = ' ';
        do{ 
            System.out.print("Enter yes or y if you want to roll the dice: ");
            ch = sc.next().toLowerCase().charAt(0);

            if(ch == 'y'){
              attempt++;
             System.out.println("Roll the dice");
             value = random.nextInt(6) + 1;
             System.out.println(value);
            }

             

        }while(value != 6);
        System.out.println("You took " + attempt + " attempts");

        sc.close();
    }
    
}
