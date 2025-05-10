import java.util.Scanner;

public class IsPalindrome38 {
    public static void main(String[] args) {
        isPalindrome38();
    }
    private static void isPalindrome38() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number");
        System.out.println("Please enter your number: ");
        int num= sc.nextInt();
        boolean isPalindrome=isPalindrome(num);

        if (isPalindrome){
            System.out.println("Your number is a palindrome");
        }else{
            System.out.println("Your number is  not a palindrome");
        }


    }

    private static boolean isPalindrome(int num){
        int reverse =reverse(num);
        return num==reverse;
    }
    private static int reverse(int num) {
        int newNum=0;
        while(num >0){
            int digit=num % 10;
            newNum=newNum * 10 +digit;
            num /=10;

        }
        return newNum;
    }

}
