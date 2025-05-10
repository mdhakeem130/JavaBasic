import java.util.Scanner;

public class FibonacciSeries36 {
    public static void main(String[] args) {
     fibonacciSeries36();
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

}
