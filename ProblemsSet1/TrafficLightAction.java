import java.util.Scanner;
import java.lang.String;
public class TrafficLightAction {

    static void trafficLightAction(String color){

            if(color.equalsIgnoreCase("Red") ){
                System.out.println("Stop");
             }
        
            else if(color.equalsIgnoreCase("Yellow")){
             System.out.println("Ready");
             }
        
            else if(color.equalsIgnoreCase("Green")){
                System.out.println("Go");
            }
        
            else{
            System.out.println("Invaild");
            }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Color: ");
        String color = sc.nextLine();

        trafficLightAction(color);
    }
}
