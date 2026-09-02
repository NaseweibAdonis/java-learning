// Given top-left and bottom-right coordinates of a rectangle, check if a point (x,y) lies inside it.

import java.util.Scanner;
public class PointInsideRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the top-left point x1 of the rectangle: ");
        int x1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the top-left point y1 of the rectangle: ");
        int y1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the bottom-right point x2 of the rectangle: ");
        int x2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the bottom-right point y2 of the rectangle: ");
        int y2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the point x: ");
        int x = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the point y: ");
        int y = sc.nextInt();

        sc.nextLine();

        if(findPoint(x1,y1,x2,y2,x,y)){
            System.out.println("The point " + x  + " and " + y + " lies inside the rectangle" );
        }
        else{
            System.out.println("The point " + x  + " and " + y + " does not lies inside the rectangle" );
        }
       
        sc.close();

    }
   static boolean findPoint(int x1 , int y1 , int x2 , int y2 , int x , int y ){

        if( x > x1 && x < x2 && y > y1 && y < y2){
            return true;
        }
        return false;
    }
}
