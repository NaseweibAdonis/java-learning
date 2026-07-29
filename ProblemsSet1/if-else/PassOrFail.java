// Take a student's mark as input. Print "Pass" if the mark is 50 or above; otherwise, print "Fail".

import java.util.Scanner;
 public class PassOrFail {
    
    static boolean isPassorFail(int mark){
        if(mark >= 50){
            return true;
        }
        else{
            return false;
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the marks: ");
            int mark = sc.nextInt();

            if(isPassorFail(mark)){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
        
    }

}
