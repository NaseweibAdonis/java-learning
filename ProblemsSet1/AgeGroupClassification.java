import java.util.Scanner;
public class AgeGroupClassification {
    static void ageGroupClassification(int age){
        if (age >= 0 && age <= 12){
            System.out.println("Child");
        }
        else if(age >= 13 && age <= 19){
            System.out.println("Teenage");
        }
        else if(age >= 20 && age <= 59){
            System.out.println("Adult");
        }
        else if(age >= 60){
            System.out.println("Senior");
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        ageGroupClassification(age);
    }
}
