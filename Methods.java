public class Methods {

 // using static because there is no need for an oject for calling the function

   // without parameters without return type 
   static void print(){    
       
    System.out.println("Hello World!");
    }

    // with parameters with return type
    static int sum(int a , int b){        
          
        return a+b;
    }

    // with parameters without return type
    static void product(int a , int b){   
        
        System.out.println("The product: "+ (a*b)); 
    }
        public static void main(String[] args) {

        print();
        System.out.println("The sum: "+(sum(3,4)));
        product(3,4 );

    }
}
