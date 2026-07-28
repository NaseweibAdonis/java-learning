// Take a score (0–100) and print "Grade A" (90+), "Grade B" (75–89), "Grade C" (50–74), or "Grade F" (below 50).

import java.util.Scanner;
public class GradeEvaluator {
    static void gradeEvaluater(int marks){
        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75 && marks <= 89){
            System.out.println("Grade B");
        }
        else if(marks >= 50 && marks <= 74){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade F");
        }
        
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();

        gradeEvaluater(mark);
    }
}
