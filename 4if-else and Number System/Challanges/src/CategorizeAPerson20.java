import java.util.Scanner;

public class CategorizeAPerson20 {
    //20 Create a program that categorize a person into different age groups
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to age Calculator");
        System.out.println("Enter your age to check from which categorize you belong ");
        int age=input.nextInt();

        if(age >=60)

        {
            System.out.println("you are Senior citizen");
        } else if (age>=20) {
            System.out.println("you are from adult ");
        } else if (age >=  13) {
            System.out.println("you are form teen");
        }else {
            System.out.println("you are child");
        }
    }
}
