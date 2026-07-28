//Start from 10 and count down to 1, then print "Liftoff!".

public class CountdownTimer {
    public static void main(String[] args) {
        int n = 10;
        while(n >= 0){
            System.out.print(n + " ");
            n--;
        }
        System.out.println("Liftoff!");
    }
}
