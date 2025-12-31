public class Operators {
    public static void main(String args[]){

        int a = 5;
        int b = 6;

        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);

        // Unary Operator (++,--)

        int pre_increment = ++a;
        int post_increment = a++;
        int pre_decrement = --a;
        int post_decrement = a--;

        System.out.println("Pre Increment of A: "+pre_increment);
        System.out.println("Post Increment of A: "+post_increment);
       // System.out.println("Value of A after Increment: "+a);

        System.out.println("Pre Decrement of A: "+pre_decrement);
        System.out.println("Post Decrement of A: "+post_decrement);
       // System.out.println("Value of B after Decrement: "+b);


        // Arithmetic Operators (+ , - , * , / , %)

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);

        // Relational Operator (< , > , == , <= , >=)  

        boolean isGreater = a > b;
        boolean isLesser = a < b;
        boolean isEqual = a==b;
        boolean isGreaterOrEqual =  a >= b;
        boolean isLesserOrEqual = a <= b;

        System.out.println("A Greater than B: "+isGreater);
        System.out.println("A Lesser than B: "+isLesser);
        System.out.println("A Equal B: "+isEqual);
        System.out.println("A Greater than or Equal to B: "+isGreaterOrEqual);
        System.out.println("A Lesser than or Equal to B: "+isLesserOrEqual);

        // Logical Operator (&& , || , !)

        boolean andOperator = a > b && a != b;
        boolean orOperator = a < b || a == b;
        boolean notOperator = !(a>b);

        System.out.println("And Operator: "+andOperator);
        System.out.println("Or Operator: "+orOperator);
        System.out.println("Not Operator: "+notOperator);

        // Assignment Operator 

        int count = 10;

        System.out.println("The value of count after addition: "+(count += 10));
        System.out.println("The value of count after subtraction: "+(count -= 10));
        System.out.println("The value of count after multiplication: "+(count *= 10));
        System.out.println("The value of count after  : "+(count /= 10));
        System.out.println("The value of count after : "+(count %= 10));




        
       

    }
}
