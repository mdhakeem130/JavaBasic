import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        // AND    OR     NOT
        //1 Types: && (AND) , || (OR),!(NOT)
        //2 AND(&&): All conditions must be true for the result
          //eg true && true ==true otherwise false
       // 3 OR(||): Only one condition must be ture for the result
          //eg  false || true  one must be true
       //4 Not(!): Inverts the Boolean value of a condition
       //5 Lower Priority than Math and Comparison operators

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.println("Please enter your age: ");
        int age =scanner.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale=scanner.nextBoolean();
        if (age < 5){
            System.out.println("You got 75% discount");
        } else if (isFemale){
            System.out.println("You got 50% discount");
        }else if (age >60 && !isFemale){
            System.out.println("You got 25% discount");
        }else{
            System.out.println("You get no discount");
        }









    }
}
