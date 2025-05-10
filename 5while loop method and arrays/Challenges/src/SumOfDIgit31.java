import java.util.Scanner;

public class SumOfDIgit31 {
    public static void main(String[] args) {
        //2 create a program that compute the sum of digits of an integer.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Factorial ");
        System.out.println("Please enter your number");
        int num=scanner.nextInt();
        System.out.println("Sum of Digits is "+sumDigit(num));
    }
    public static int sumDigit(int num)
    {
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
