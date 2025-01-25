import java.util.Scanner;

public class SimpleInterest12 {
    public static void main(String[] args) {
        //12 Create a program to calculate simple interest
           //Simple interest =(P * T * R)/100
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator\n");
        System.out.println("Please enter your principle amount Rs:");
        int principle=input.nextInt();
        System.out.println("Now, Tell me yours rate of interest");
        float rate=input.nextFloat();
        System.out.println("Now, tell me for how many years are you borrowings  interest rate money");
        float years=input.nextFloat();

        float interest=(principle * rate * years)/100;
        System.out.println("\n\n Your Simple interest Rs: "+ interest);
    }
}

