import java.util.Scanner;

public class FahrennHeightToCelsius14 {
    public static void main(String[] args) {
        //14 create a program to convert Fahernheit to Celsius
            // Celsius =(F -32 ) * 5/9
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Temperature converter");
        System.out.println("Enter your temp in F: ");
        float fah=sc.nextFloat();
      //  float cel=(fah - 32 ) * 5 /9;//or
        float cel=(fah - 32 ) * 5f /9f;
        System.out.println("Your temperature is: "+ cel + "C");
    }
}
