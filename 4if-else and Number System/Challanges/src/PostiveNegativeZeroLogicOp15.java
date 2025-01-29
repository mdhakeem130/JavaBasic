import java.util.Scanner;

public class PostiveNegativeZeroLogicOp15 {
    public static void main(String[] args) {
        //15 Create a program that determines if a number is positive,negative or zero
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number ");
        int num= input.nextInt();

        if(num>0){
            System.out.println("Your number is positive");
        } else if (num==0) {
            System.out.println("Your number is zero");
        }else{
            System.out.println("Your number is negative");
        }
    }
}
