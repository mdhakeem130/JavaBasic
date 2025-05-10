import java.util.Scanner;

public class Chall2OfUserINput {
    public static void main(String[] args) {
        //2 Create a program to add two number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.println("Please enter first number: ");
        int fisrtNum= scanner.nextInt();
        System.out.println("Now, please enter the second number: ");
        int secondNum=scanner.nextInt();
        int sum=fisrtNum+secondNum;
        System.out.println("Sum of your numbers is: "+sum);
    }
}
