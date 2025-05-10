import java.util.Scanner;

public class ReverseTheDigit35 {
    public static void main(String[] args) {
        reverseTheDigit35();
    }
    private static void reverseTheDigit35() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number  ");
        int num=sc.nextInt();
        System.out.println("before reverse digit "+num);
        int afterReversDigit= reverseTheDigit(num);
        System.out.println("after Reverse Digit "+afterReversDigit  );

    }

    private static int reverseTheDigit(int num) {
        int newNum=0;

        while(num > 0){
            int digit=num % 10;
            newNum =newNum   * 10  +digit;
            num/=10;

        }
        return newNum;
    }
}
