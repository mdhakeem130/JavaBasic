import java.util.Scanner;

public class TestRevision2 {
    public static void main(String[] args) {
        //28 WAP to print table of number
        //multipicationTable28();
        //29 WAP to print sum Of All Odd Number
        //sumOfAllOddNumber29();
        //30 WAP to print factorial number
        //factorialnumber30();
        //31 WAP to print sum Of Digit
        //sumOfDigit31();
        //32 WAP to print lcm  of a number
        //lcm32();
        //33 WAP to calculate gcd of a number
        //gcd33();


    }
    private static void gcd33(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number  ");
        int num1=sc.nextInt();
        System.out.println("Enter the second  number  ");
        int num2=sc.nextInt();

        int gcd=gcd(num1,num2);
        System.out.println("number of gcd is "+gcd);

    }
    private static int gcd(int first,int second){
        int gcd=1;
        int i=2;
        int least=least(first,second);

        while (i <= least){
            if(first % i ==0 && second % i ==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    private static int least(int first,int second){
        if(first < second){
            return first;
        }else{
            return second;
        }
    }
    private static void lcm32(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number  ");
        int num1=sc.nextInt();
        System.out.println("Enter the second  number  ");
        int num2=sc.nextInt();

       long lcm= lcm(num1,num2);
        System.out.println("lcm of a number "+lcm);

    }
    private static long lcm(int first,int second){
        int i=1;
        //while(i<=second){ //or
         while (true){
            int factor=first * i;
            if(factor % second==0){
                return factor;
            }
            i++;
        }
        //return 0;
    }
    private static void sumOfDigit31(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int num=sc.nextInt();

        int sum=0;
        while(num>0){
            sum=sum+num % 10;
            num=num /10;
        }
        System.out.println(sum);


    }
    private static void factorialnumber30(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int num=sc.nextInt();

     /*   int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact * i;
        }*/
        //or
        long fact=1;
        int i=1;
        while(i<= num){
            fact =fact * i;
            i++;
        }
        System.out.println(fact);

    }
    private static void sumOfAllOddNumber29(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int num=sc.nextInt();

    /*    int sum=0;
        for (int i=1;i<=num;i++)
            if (i % 2 != 0) {
                sum+=i;
            }*/
        //or
        int sum=0;
        int i=1;
        while(i <= num){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("sum all odd number "+sum);

    }
    private static void multipicationTable28(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number the which you want to multi ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num * i);
        }
    }
}
