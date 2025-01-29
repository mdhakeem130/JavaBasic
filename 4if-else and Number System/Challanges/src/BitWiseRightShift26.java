import java.util.Scanner;

public class BitWiseRightShift26 {
    public static void main(String[] args) {
     //1 create a program that shows bitwise AND of two number
        Scanner sc=new Scanner(System.in);
        System.out.println("Showcasing the Bitwise Left Shift Operators \n");
        System.out.println("Enter the first number ");
        int first=sc.nextInt();

        int result=first >> 1;
        System.out.println(" Result "+result);
    }
}
