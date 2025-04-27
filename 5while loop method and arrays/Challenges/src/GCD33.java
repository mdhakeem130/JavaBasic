import java.util.Scanner;

public class GCD33 {
    public static void main(String[] args) {
        gcd33();
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

}
