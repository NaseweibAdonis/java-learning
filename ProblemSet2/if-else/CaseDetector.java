// Check if a given character is uppercase, lowercase, or non-alphabetic.

import java.util.Scanner;
public class CaseDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        if(Character.isLowerCase(ch)){
            System.out.println("The Character " + ch + " is LowerCase");
        }
        else if(Character.isUpperCase(ch)){
            System.out.println("The Character " + ch + " is UpperCase");
        }
        else {
            System.out.println("The Character " + ch + " is Non-Alphabetic");
        }
        sc.close();
    }
}
