import java.util.Scanner;

public class TriangleArea11 {
    public static void main(String[] args) {
       //11 Create a program to calculate Area of a Triangle
           //Area of triangle =1/2 *B*H
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Area Calculator\n");
        System.out.println("Please enter your base in cms: ");
        double base=input.nextDouble();
        System.out.println("Now, enter your perpendicular height in cms ");
        double height=input.nextDouble();

        //double area=0.5 * base * height;
        //or
        double area=(base * height)/2;

        System.out.println("The area of your triangle is: "+ area + "cms2");
    }
}
