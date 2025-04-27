import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Test2 {
    public static void main(String[] args) {
        //multipicationTable28() ;
        sumOfAllOddNumber29();
        //factorialnumber30();
        //sumOfDigit31();
        //lcm32();
        //gcd33();
        //isprime34();
        //reverseTheDigit35();
        //fibonacciSeries36();
        //isAramstrong37();
        //isPalindrome38();
        //printPattern39();

    }

    private static void printPattern39() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Pattern Program\n");
        System.out.print("Please enter  number of rows : ");
        int rows= sc.nextInt();
        //printFirstPattern1ORRightHalfPyramid(rows);
        //printSecondPattern1ORReverseRightHalfPyramid(rows);
        printThirdPattern1OLeftHalfPyramid(rows);
    }

    private static void printThirdPattern1OLeftHalfPyramid(int maxRows) {
        System.out.println("\nhere is left half pyramid");
        int rows=maxRows;
        while(rows > 0){
            // this loop prints spaces
            int j=0;
            while(j < rows -1){
                System.out.print(" ");
                j++;
            }
            // this loop prints stars
            int i=0;
            while(i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }


    }

    private static void printSecondPattern1ORReverseRightHalfPyramid(int maxRows) {
        int rows =maxRows;
        while (rows > 0){
            int i=0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    private static void printFirstPattern1ORRightHalfPyramid(int maxRow) {
        int rows=0;
        while(rows < maxRow){
            System.out.print("*");
            int i=0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
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

    private static void fibonacciSeries36() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number  ");
        int num=sc.nextInt();

        fibonacciSeries(num);


    }

    private static void fibonacciSeries(int num) {
        if(num < 0) return;
        if(num == 0)return;
        System.out.println("1");
        int first=0,second=1;
        while(first + second <= num){
          int third=first + second;
            System.out.println(third + " ");
            first = second;
            second= third;
        }

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

    private static void isprime34() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number ");
        int num=sc.nextInt();

       boolean isprime= isprime(num);
        if (isprime){
            System.out.println("it is prime number");
        }else{
            System.out.println("it is not prime number");
        }
    }

    private static boolean isprime(int num) {
        int i=2;
        while(i< num){
            if(num % i==0){
                return  false;
            }
            i++;
        }

        return true;
    }

    private static void gcd33() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first number  ");
        int first=sc.nextInt();
        System.out.println("Please enter your second number  ");
        int second=sc.nextInt();
     //1 way
      //  int gcd= gcd(first,second);
       // System.out.println(gcd);

        //2 way
        int i=2;
        //int least=first > second ? second : first;
        int least=0;
        if(first >second)
        {
            least=second;
        }else{
            least=first;
        }

        while(i<= least){

            if(first % i ==0 && second % i ==0){
                System.out.println(i);
                break;

            }
            i++;
        }

    }

    private static int gcd(int first, int second) {
        int gcd=1;
        int i=2;
        int least=least(first,second);
        while(i<=least){
            if(first % i ==0 && second % i == 0){
                return gcd =i;
            }
            i++;
        }
        return gcd;
    }

    private static int least(int first, int second) {
        if(first<second){
            return first;
        }else{
            return second;
        }
    }

    private static void lcm32() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first number  ");
        int first=sc.nextInt();
        System.out.println("Please enter your second number  ");
        int second=sc.nextInt();

      // int lcm=lcm(first,second);
       //System.out.println("lcm of number "+lcm);

        //or  3 way
        int i=1;
        int factor=0;
        while(i<=second){
             factor=first * i;
            if(factor % second ==0){
                factor=factor;
                break;
            }
            i++;

        }
        System.out.println("lcm of number "+factor);


    }

    private static int  lcm(int first, int second) {
       int i=1;
       // 1  way
     /*
      while(i<=second){
           int factor=first * i;
           if(factor % second ==0){
               return factor;
           }
           i++;

       }*/

       // return 0;
       //or 2 way
        while(true){
            int factor=first * i;
            if(factor % second ==0){
                return factor;
            }
            i++;

        }
    }




    private static void sumOfDigit31() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number  ");
        int num=sc.nextInt();

        int sum=0;

        while(num > 0){
          sum=sum+num % 10;
          num =num /10;
            ;
        }
        System.out.println("sum of digit is "+sum);
    }

    private static void factorialnumber30() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number  ");
        int num=sc.nextInt();

        long fact=1;
        int i=1;


        while(i<= num){
            fact =fact * i;
            i++;
        }
        System.out.println(fact);

    }

    private static void sumOfAllOddNumber29() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number  ");
        int num=sc.nextInt();

        int sum=0;
        int i=1;
        while(i <= num){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("all odd sum "+sum);
    }

    private static void multipicationTable28() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number to be printed table");
        int num=sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(num + " X " + i + " = " +(num * i));
            i++;
        }

    }
}
