import java.util.Scanner;

public class IsPrimeNumber34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your  number  ");
        int num=sc.nextInt();

        boolean isPrime=isPrime(num);
        if(isPrime){
            System.out.println("it is prime number");
        }else{
            System.out.println("it is not prime");
        }
    }
    private static boolean isPrime(int num){
        int i=2;
        while (i < num){
          if(num % i==0 ){
              return false;
          }
            i++;
        }
        return true;
    }
}
