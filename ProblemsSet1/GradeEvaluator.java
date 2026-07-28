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
     void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();

        gradeEvaluater(mark);
    }
}
