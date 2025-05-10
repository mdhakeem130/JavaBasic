import java.util.Scanner;

public class ArithmeticOperators8 {
    public static void main(String[] args) {
        // 8 create  a program that takes two number and shows result of all
        // arithmetic operators (+,-,*,%)
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to arithmetic calculator\n");
        System.out.println("Please enter first number: ");
        int first=sc.nextInt();
        System.out.println("Now, please enter second number: ");
        int second=sc.nextInt();

        int add=first + second;
        int sub=first - second;
        int mul=first * second;
        int div=first / second;
        int mod=first % second;
        System.out.println("Addition is: "+ add);
        System.out.println("Subtraction is:"+ sub);
        System.out.println("Multiplication is: "+ mul);
        System.out.println("Division is: "+div);
        System.out.println("Modulus is: "+mod);

    }

}

