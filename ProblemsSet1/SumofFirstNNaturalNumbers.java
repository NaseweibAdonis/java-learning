import java.util.Scanner;
public class SumofFirstNNaturalNumbers {
      void main(){
        
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the vale of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The Sum of First " + n + " Natural Numbers is: " + sum);
        
    }
}
