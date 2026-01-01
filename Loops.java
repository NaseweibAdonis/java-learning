public class Loops {
    public static void main(String[] args){

       

        // For Loop

        System.out.println("For Loop");
        for( int i = 0; i <= 10; i++){
            System.out.println("The value of i: "+i);
        }


        // For Each Loop

        System.out.println("For Each Loop");
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        for(int num : nums){
            System.out.println("n = "+num);
        }
        

        // While Loop

        int j = 0;
        System.out.println("While Loop");
        while (j <= 10) {
            System.out.println("The value of j: "+j);
            j++;
        }


        // Do While Loop

        int k = 0;
        System.out.println("Do While Loop");
        do{
            System.out.println("The value of k: "+k);
            k++;
        }while(k <= 10);


    }
}
