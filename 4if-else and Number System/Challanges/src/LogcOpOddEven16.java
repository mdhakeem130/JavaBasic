import java.util.Scanner;

public class LogcOpOddEven16 {
    //16 create a program tha determines if a number is positive,negative or zero
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Odd Even calculator\n");
        System.out.println("Please enter the number to check odd or even number");
        int num=input.nextInt();

        if(num%2==0)
        {
            System.out.println("It is Even number");
        }else{
            System.out.println("it is odd number");
        }
    }
}
