import java.util.Scanner;

public class TestRevision {
    public static void main(String[] args) {
        //1 print good morning
        //goodMorning1();
        //2 print subscribed message
        //subscribed2();
        //3 print pattern program
        //patterns3();
        //4 print pattern program into single line
        //patternsSingleLine4();
        //5 print name 5
        //printName5();
        //6 WAP to add two number getting input from scanner
        //addTwoNumber6();
        //7 WAP to swap two number getting input from scanner
        //swapTwoNumber7();
        //8 WAP to perform arthmetic  Operation
        //arthimeticOperation8();
        //9 WAP to calculate product
        //productFloationg9();
        //10 WAP to print area of tra angle
        //areaOfTraangle10();
        //11 WAP to print parameter of a Ractangle
        //parameterofaRactangle11();
        //12 WAP to print simple Interest
        //simpleInterest12();
        //13 WAP to print component Interest
        //componentInterest13();
        //14 WAP to convert  fahranheight To Celsius
        //fahranheightToCelsius14();
        //15 WAP to check positive and negative number
        //numberCheckPosNegZero15();
        //16 WAP to check number is  odd Or Even
        //oddOrEvenNum16();
        //17 WAP to check greatest Of Three Number
        //greatestOfThreeNumber17();
        //18 WAP to print leap year
        //leapYear18();
        //19 WAP to check marks  grads
        //greadsMarksCal19();
        //20 WAP to categorize Persion
        //categorizePersion20();
        //21 WAP to print bitwiseAnd
        //bitwiseAnd21();
        //22 WAP to print bitwiseOR
        //bitwiseOR22();
        //23 WAP to print bitwiseOR
        //bitwiseXOR23();
        //24 WAP to print bitwiseOR
        //bitwiseComplement24();
        //25 WAP to print leftShiftOp
        //leftShiftOp25();
        //26 WAP to print right shift op
        //rightShiftOp26();
        //27 WAP to print oddOrEvenUsingBitwise
        //oddOrEvenUsingBitwise27();

    }
    private static void oddOrEvenUsingBitwise27() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=sc.nextInt();

        if((num & 1) ==1){
            System.out.println("number is odd ");
        }else{
            System.out.println("number is even ");
        }
    }

    private static void rightShiftOp26() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=sc.nextInt();

        int leftShiftop=num >> 4;
        System.out.println(leftShiftop);
    }
    private static void leftShiftOp25(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=sc.nextInt();

        int leftShiftop=num << 1;
        System.out.println(leftShiftop);

    }
    private static void bitwiseComplement24(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number ");
        int num1=sc.nextInt();
        int bitwiseComplement=~num1;
        System.out.println("bitwiseComplement result is "+bitwiseComplement);

    }
    private static void bitwiseXOR23(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first num1 ");
        int num1=sc.nextInt();
        System.out.println("pls enter your second num2");
        int num2=sc.nextInt();

        int bitWiseXOR=num1 ^ num2;
        System.out.println("bitwiseXOR result is "+bitWiseXOR);

    }
    private static void bitwiseOR22(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first num1 ");
        int num1=sc.nextInt();
        System.out.println("pls enter your second num2");
        int num2=sc.nextInt();

        int bitWiseOR=num1 | num2;
        System.out.println("bitwiseOR result is "+bitWiseOR);

    }
    private static void bitwiseAnd21(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first num1 ");
        int num1=sc.nextInt();
        System.out.println("pls enter your second num2");
        int num2=sc.nextInt();

        int bitWiseAnd=num1 & num2;
        System.out.println("bitwiseAnd result is "+bitWiseAnd);

    }
    private static void categorizePersion20(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=sc.nextInt();

        if(age >=60){
            System.out.println("you are senior citezen person");
        } else if (age >= 18) {
            System.out.println("your are adult person ");
        } else if (age >=13) {
            System.out.println("your are teneger ");
        }else{
            System.out.println("you are child");
        }
    }
    private static void greadsMarksCal19(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks to calculate grads ");
        int marks=sc.nextInt();

        if(marks >= 90){
            System.out.println("you have got A grads marks");
        } else if (marks >= 75) {
            System.out.println("you have got B grads marks");
        } else if (marks >= 60) {
            System.out.println("you have got C grads marks");
        } else if (marks >=30 ) {
            System.out.println("you have got D grads marks ");
        }else{
            System.out.println("sorry u failed, you have got F grads marks ");
        }


    }
    private static void leapYear18(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year to check year is leap year or not ");

        int year=sc.nextInt();

        if(year % 400 ==0 || (year % 4==0 && year % 100 !=0)){
            System.out.println("year is leap year ");
        }else{
            System.out.println("not leap year");
        }

    }
    private static void greatestOfThreeNumber17(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        System.out.println("enter the third number");
        int num3=sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("num 1 is greatest number "+num1);
        } else if (num2 > num3) {
            System.out.println("num2 is greatest number "+num2);
        }else{
            System.out.println("num3 is greatest number "+num3);
        }

    }
    private static void oddOrEvenNum16(){
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter the number to check odd or even number");
        int num=sc.nextInt();

        if(num % 2 == 0){
            System.out.println("number is  even "+num);
        }else{
            System.out.println("number is odd "+num);
        }

    }
    private static void numberCheckPosNegZero15(){
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter the number to check positive and negative number");
        int num=sc.nextInt();

        if(num >0){
            System.out.println("number is positive ");
        }else if(num < 0){
            System.out.println("number is negative ");
        }else{
            System.out.println("number is zero ");
        }


    }
    private static void fahranheightToCelsius14(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fahrenheit ");
        float fahranheigt=sc.nextFloat();

        float celsius=(fahranheigt - 32 )* 5/9;
        System.out.println("fahranhegith to celsius "+celsius +"C");

    }
    private static void componentInterest13(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your principal ");
        int  principal=sc.nextInt();
        System.out.println("enter your repo interest rate ");
        float rate= sc.nextFloat();
        System.out.println("enter your time for how many year u want to pay");
        float year=sc.nextFloat();

        double componentInterest= principal * Math.pow((1 + rate/100),year);
        System.out.println("Your component interest is "+componentInterest);


    }
    private static void simpleInterest12(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your principal ");
        int  principal=sc.nextInt();
        System.out.println("enter your repo interest rate ");
        float rate= sc.nextFloat();
        System.out.println("enter your time for how many year u want to pay");
        float year=sc.nextFloat();

        float simpleInterest=principal * year * rate /100;
        System.out.println("Your simple interest is "+simpleInterest);

    }
    private static void parameterofaRactangle11(){
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter all four side in cms");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();

        float parameterofRactangle=a + b + c + d;
        System.out.println("Parameter of Ractangle is "+parameterofRactangle);


    }
    private static void areaOfTraangle10(){
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter  your base in cms");
        float base=sc.nextFloat();
        System.out.println("please enter your prependuclr");
        float height=sc.nextFloat();

        float areaOftraangle=(float) (0.5 * base * height);
        System.out.println("Area of triangle is "+areaOftraangle);

    }
    private static void productFloationg9(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        double num1=sc.nextFloat();
        System.out.println("enter your second number");
        double num2=sc.nextFloat();

        double product=num1 * num2;
        System.out.println("product of two floating is "+product);

    }
    private static void arthimeticOperation8(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=sc.nextInt();
        System.out.println("enter your second number");
        int num2=sc.nextInt();

        int addition=num1 + num2;
        int sub     =num1 - num2;
        int mul     =num1 * num2;
        int mod     =num1 % num2;
        int div     =num1 / num2;

        System.out.println("addition of two number "+addition);
        System.out.println("sub      of two number "+sub);
        System.out.println("mul      of two number "+mul);
        System.out.println("div      of two number "+div);
        System.out.println("mod      of two number "+mod);
    }
    private static void swapTwoNumber7(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=sc.nextInt();
        System.out.println("enter your second number");
        int num2=sc.nextInt();

        //using third variable
       /* int num3 =num1;
        num1=num2;
        num2=num3;*/

        //without using third variable
        num1 =num1 + num2;
        num2 =num1 - num2;
        num1=num1 - num2;
        System.out.println("num 1 = " +num1 +" num2 = "+num2);


    }
    private static void addTwoNumber6(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=sc.nextInt();
        System.out.println("enter your second number");
        int num2=sc.nextInt();

        int addTwoNumber=num1 +num2;
        System.out.println("add two number result is "+addTwoNumber);
    }
    private static void printName5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=sc.next();
        System.out.println("Welcome "+name+" to java world");
    }
    private static void patternsSingleLine4(){
        //rightHalfPyramidOneLine();
        //reverseRightHalfPyrmidOneLine();
         leftHalfPyramidOneLine();
    }
    private static void leftHalfPyramidOneLine(){
        System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *");
    }
    private static void reverseRightHalfPyrmidOneLine(){
        System.out.println(" * * * * * \n * * * *\n * * *\n * *\n *");
    }
    private static void rightHalfPyramidOneLine(){
        System.out.println(" *\n * *\n * * *\n * * * *\n * * * * *");

    }
    private static void patterns3(){
        //rightHalfPyramid1();
        //reverseRightHalfPyrmid1();
       // leftHalfPyramid1();
    }
    private static void leftHalfPyramid1(){
        System.out.println("         *");
        System.out.println("       * *");
        System.out.println("     * * *");
        System.out.println("   * * * *");
        System.out.println(" * * * * * ");
    }
    private static void reverseRightHalfPyrmid1()
    {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

    }
    private static void rightHalfPyramid1(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

    }
    private static  void goodMorning1(){
        System.out.println("Good Morning ");
    }
    private static  void subscribed2(){
        System.out.println("Subscribed ");
    }
}
