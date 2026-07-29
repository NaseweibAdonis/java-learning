// Take three side lengths and check if they can form a valid triangle (a+b>c).
import java.util.Scanner;
public class TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side a: ");
        int a = sc.nextInt();
        System.out.print("Enter the side b: ");
        int b = sc.nextInt();
        System.out.print("Enter the side c: ");
        int c = sc.nextInt();

        if(((a + b) > c)){
            System.out.println("Forms a valid Triangle");
        }
        else{
            System.out.println("It does not Forms a valid Triangle");
        }
        sc.close();
    }
    
}
