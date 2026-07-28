//Take an age as input. Print "Eligible to vote" if age is 18 or older, else print "Not eligible".

import java.util.Scanner;
public class VotingEligibility {
    
    static boolean isVotingEligibile(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(isVotingEligibile(age)){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
