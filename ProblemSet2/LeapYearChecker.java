//Determine if a year is a leap year (divisible by 4, but not by 100 unless also divisible by 400).

import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if( year % 4 == 0 && !(year % 100 == 0) && !(year % 400 == 0)){
            System.out.println("The Year " + year + " is Leap Year");
        }
        else{
            System.out.println("The Year " + year + " is not a Leap Year");
        }
        sc.close();
    }
}
