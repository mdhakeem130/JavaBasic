import java.util.Scanner;

public class Challange1OfUserInput {
    public static void main(String... args) {
        //1 create a program to input name of the person and respond
        //with "Welcome NAME to kg Coding"
        System.out.println("Please enter your name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        //System.out.println("Welcome : "+ name);
        System.out.println("Welcome "+name + " Hi Coder");
    }
}
