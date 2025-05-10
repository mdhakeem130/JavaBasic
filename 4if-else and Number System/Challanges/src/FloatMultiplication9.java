import java.util.Scanner;

public class FloatMultiplication9 {
    public static void main(String[] args) {
        //9 Create a program to calculate product of tow floating points numbers
        Scanner input=new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.println("Please enter the first decimal number: ");
        double first=input.nextDouble();
        System.out.println("Now, please enter the second number: ");
        double second=input.nextDouble();
        double mul=first * second;

        System.out.println("\n Result is:  "+mul);
        //or
       // System.out.println("\n Result is:  "+first*second);
        System.out.println("\n Result is:  "+first+second);//2.53.5
        //we need do () in the breakets other wise this will produce same as above result
        System.out.println("\n Result is:  "+(first+second));
        //mul
        System.out.println("\n Result is:  "+(first*second));



    }
}
