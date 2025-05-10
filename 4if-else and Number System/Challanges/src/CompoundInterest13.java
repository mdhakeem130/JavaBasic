import java.util.Scanner;

public class CompoundInterest13 {
    public static void main(String[] args) {
        //13 create a program to calculate Compound interest
           //Compound  Interest =P (1+ R/100)t
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Compound Calculator\n");
        System.out.println("Please enter your principle amount Rs:");
        int principle=input.nextInt();
        System.out.println("Now, Tell me yours rate of interest");
        float rate=input.nextFloat();
        System.out.println("Now, tell me for how many years are you borrowings  interest rate money");
        float years=input.nextFloat();

        double compInterest=principle * Math.pow((1 + rate/100),years);
        System.out.println("Your compound interest is Rs: "+compInterest);

    }
}
