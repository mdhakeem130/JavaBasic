import java.util.Scanner;

public class BitWiseCompliment24 {
    public static void main(String[] args) {
     //1 create a program that shows bitwise AND of two number
        Scanner sc=new Scanner(System.in);
        System.out.println("Showcasing the Bitwise NOT/Compliment Operators \n");
        System.out.println("Enter the first number ");
        int first=sc.nextInt();

        int result=~first;
        System.out.println(" Result "+result);
    }
}
