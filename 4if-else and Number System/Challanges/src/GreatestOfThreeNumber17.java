import java.util.Scanner;

public class GreatestOfThreeNumber17 {
    public static void main(String[] args) {
        //17  create a program that determines the greatest of three numbers
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the first number a ");
        int a=sc.nextInt();
        System.out.println("Now enter the second number b");
        int b=sc.nextInt();
        System.out.println("Finally enter the third number c");
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("a is the greatest number "+a);
        } else if (b>=c) {
            System.out.println("b is the greatest number "+b);
        }else{
            System.out.println("c is the greatest number "+c);
        }

    }
}
