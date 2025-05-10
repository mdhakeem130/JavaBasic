import java.util.Scanner;

public class GradesMarks19 {
    public static void main(String[] args) {
        //19 create a program that calculate grades based on marks
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the marks to check grades");
        int marks=input.nextInt();

        if(marks>=90)
        {
            System.out.println("Great, You have got A grads");
        } else if (marks>=75) {
            System.out.println("Good, You have got B grads");
        } else if (marks >=60) {
            System.out.println("You have got C grads ,Work harder next time");
        } else if (marks>=30) {
            System.out.println("You have got D grads, You need to work hard");
        }else{
            System.out.println("Sorry, You hava got F grads");
        }
    }
}

