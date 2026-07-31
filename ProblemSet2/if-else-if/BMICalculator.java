// Calculate BMI (weight/height ^ 2) and classify as Underweight, Normal, Overweight, or Obese.

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your body weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meter: ");
        double height = sc.nextDouble();

        double bmi = (weight / (height * height));

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.90){
            System.out.println("Healthy weight");
        }
        else if(bmi >= 25.0 && bmi <= 29.90){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obesity");
        }

        sc.close();
    }
    
}
/*Underweight: Below 18.5Healthy weight: 18.5 to 24.9Overweight: 25.0 to 29.9Obesity: 30.0 or highe */
