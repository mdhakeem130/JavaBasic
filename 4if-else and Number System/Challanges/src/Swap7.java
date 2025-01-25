import java.util.Scanner;

public class Swap7 {
    public static void main(String[] args) {
       //7 Create a program to swap two numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number firstNum ");
        int firstNum=sc.nextInt();
        System.out.println("Also, please enter the second number secondNum");
        int secondNum=sc.nextInt();
        int tempNum;
        System.out.println("before swap the number");
        System.out.println("firstNum "+firstNum);
        System.out.println("secondNum "+secondNum);
        tempNum=firstNum;
        firstNum=secondNum;
        secondNum=tempNum;

        System.out.println("after swap the number");
        System.out.println("firstNum "+firstNum);
        System.out.println("secondNum "+secondNum);

    }
}
