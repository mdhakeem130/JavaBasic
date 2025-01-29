import java.util.Scanner;

public class EvenOddBItWise26 {
    public static void main(String[] args) {
        // 26 write a program to check if given number is even or odd using bitwise operators
        System.out.println("Welcome to odd/even calculator ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=scanner.nextInt();

        if((num & 1) == 1){
            System.out.println("Your number is odd");
        }else{
            System.out.println("Your number is even");
        }
    }
}
