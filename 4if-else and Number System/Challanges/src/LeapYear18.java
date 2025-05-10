import java.util.Scanner;

public class LeapYear18 {
    public static void main(String[] args) {
      // 18 Create a program that determines if a given year is a leap year
        //(considering conditions like divisible by 4 but not 100,unless also divisible by 400)
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the year in num to check leap year");
        int year=sc.nextInt();

        if(year %4==0 && year%100!=0 || year %400 ==0) {
            System.out.println("it is leap year");
        } else {
            System.out.println("it is not leap year");
        }
    }
}
