// Convert a binary number (entered as an integer of 0s and 1s) into its decimal equivalent.

import java.util.Scanner;
public class BinarytoDecimalConversion {

  public static void binarytoDecimalConversion(int binary) {

    int rem = 0;
    double counter = 0;
    double decimal = 0.0;

    while(binary > 0){
        rem = binary % 10;
        decimal = decimal + (rem * Math.pow(2 , counter));
        binary = binary / 10;
        counter++;
    }
        int final_decimal = (int) (decimal);
        System.out.println(final_decimal);

      }
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        binarytoDecimalConversion(binary);
}
}
