import java.util.Scanner;

public class IsAramstrong37 {
    public static void main(String[] args) {
        isAramstrong37();
    }
    private static void isAramstrong37() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.println("Please enter your number: ");
        int num= sc.nextInt();
        boolean isArmstrong=isAramstrong(num);
        if (isArmstrong)
        {
            System.out.println("Your number is Armstrong");
        }else{
            System.out.println("Your number is not Armstrong");
        }
    }

    private static boolean isAramstrong(int num) {
        int noOfdigits=noOfDigits(num);
        int numCopy=num;
        System.out.println("No Of Digits! "+noOfdigits);
        int finalNumber=0;
        while(num > 0){
            int lastDigit=num % 10;
            num /=10;
            finalNumber +=pow(lastDigit,noOfdigits);
        }

        return finalNumber==numCopy;
    }
    private static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while(i < num2){
            result *=num1;
            i++;
        }
        System.out.println("Pow of "+num1 + " is " + result) ;
        return result;
    }
    private static int noOfDigits(int num) {
        int digits=0;
        while (num > 0){
            digits++;
            num /=10;
        }
        return digits;
    }
}

