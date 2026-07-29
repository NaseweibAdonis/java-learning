// Take a single character input and determine whether it is a vowel or a consonant.

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Letter: ");
        char letter = sc.next().charAt(0);
        char lowercase_letter = Character.toLowerCase(letter);

        if(lowercase_letter == 'a' || lowercase_letter == 'e' || lowercase_letter == 'i'|| lowercase_letter == 'o' || lowercase_letter == 'u')
            {
            System.out.println("The Letter " + letter + " is a Vowel");
        }
        else{
            System.out.println("The Letter " + letter + " is a Consonant");
        }
        sc.close();
    }
}
