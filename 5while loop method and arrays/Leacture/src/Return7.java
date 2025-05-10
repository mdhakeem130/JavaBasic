import java.util.Scanner;

public class Return7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //System.out.println("Welcome to Calculator\n"); OR
        greet();

       // System.out.println("Please enter the number: ");
       // int first=input.nextInt(); OR
        int first=readNumber();
        //System.out.println("Please enter the number: ");
        //int second=input.nextInt(); OR
          //int second=readNumber()+1;
          int second=readNumber();
         // int sum=first+second+2;
          int sum=first+second;
        System.out.println("Sum of the numbers "+sum);
    }

    public static int readNumber(){
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the number: ");
        // int number=input.nextInt();
        // return number;OR
        return input.nextInt();
    }
    public static void greet(){
        System.out.println("Welcome to Calculator \n");
    }


}
