import java.util.Scanner;

public class BitWiseOR22 {
    public static void main(String[] args) {
     //1 create a program that shows bitwise AND of two number
        Scanner sc=new Scanner(System.in);
        System.out.println("Showcasing the Bitwise OR Operators \n");
        System.out.println("Enter the first number ");
        int first=sc.nextInt();
        System.out.println("Now, Enter the second number ");
        int second=sc.nextInt();

        int result=first | second;
        System.out.println(" Result "+result);
    }
}
