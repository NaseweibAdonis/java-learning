// Convert a binary number (entered as an integer of 0s and 1s) into its decimal equivalent.

import java.util.Scanner;
public class BinarytoDecimalConversion {

    // public static int binarytoDecimalConversion(int n){
    // }
    public static void main(String[] args) {
        
    
    int binary = 101001;
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
}
