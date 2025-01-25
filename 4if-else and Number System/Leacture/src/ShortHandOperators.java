import java.util.Scanner;

public class ShortHandOperators {
    public static void main(String[] args) {
        // Operator     Name of the operator Example   Equivalent
        //  +=              Addition           x+=4       x=x+4
        //  %=              Remainder ass      x%=4       x=x%4
        int a=5;
        Scanner  input=new Scanner(System.in);
        int x1=input.nextInt();
        a=a+x1;
        System.out.println(a);

        int x2=input.nextInt();
        a=a+x2;
        System.out.println(a);
        int x3=input.nextInt();
        a=a+x3;
        System.out.println(a);
        int x4=input.nextInt();
        a=a+x4;
        System.out.println(a);
        int x5=input.nextInt();
        a=a+x5;
        System.out.println(a);

    }
}
