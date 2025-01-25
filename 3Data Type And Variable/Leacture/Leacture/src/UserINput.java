import java.util.Scanner;

public class UserINput {
    public static void main(String[] args) {
        /*list of input print method nextInt(),nextDouble(),nextFloat(),
        * nextLong(),nextLine() */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=input.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.println(name+", Also tell me your age");
        int age=input.nextInt();
        System.out.println("Your age is: "+age);
    }
}
