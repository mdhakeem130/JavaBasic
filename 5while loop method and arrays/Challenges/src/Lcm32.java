import java.util.Scanner;

public class Lcm32 {
    public static void main(String[] args) {
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
    private static int lcm(int first,int second){
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
}
