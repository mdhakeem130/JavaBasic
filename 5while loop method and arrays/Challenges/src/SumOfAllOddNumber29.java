import java.util.Scanner;

public class SumOfAllOddNumber29 {
    public static void main(String[] args) {
        //2 create a program to sum all odd numbers from 1 to a specified number N.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Odd Sum ");
        System.out.println("Please enter your number");
        int num=scanner.nextInt();
        //int sum=sumAllOddNum(num);
        //System.out.println("SumALlOddNum till "+num +" is: "+sum);



        System.out.println(sumAllOddNum(num));
    }


    public static int sumAllOddNum(int num){
        int sum=0;
        int i=1;
        while (i<= num){
            sum+=i;
            i+=2;
        }
        return sum;
    }

}
