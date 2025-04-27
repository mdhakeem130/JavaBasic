import java.util.Scanner;

public class CalculateFactorial30 {
    public static void main(String[] args) {
        //need to do more
        //3 Write a function that calculate the factorial of a given number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.println("Please enter your number");
        int num=scanner.nextInt();
        long fact=  factorial(num);
        System.out.println("Factorial is: "+fact);
    }

    public static long  factorial(int num){
        if (num < 2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
