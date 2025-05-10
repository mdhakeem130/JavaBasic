import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        //<,>,<=,>=,==,!=
        // Equality
           // == check value equality
            //eg 0==0 , 5==5 =true ,6==5=false,
          // === check value and type equality
       // Inequality
          // != checks value inequality
         // !== checks value and type inequality
      // Relational
         // > Greater Than
         // < Less Than
        //  >= gt or equal to
        //  <= lt pr et
     // note--> Order of relational is less than arithmetic operators
        Scanner sc=new Scanner(System.in);
     /*   System.out.println("Drive ");
        System.out.println("Enter your age ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("you have permit to drive a car  ");
        }else{
            System.out.println("yor do not have permit to drive a car");
        }*/
        System.out.println("Welcome to Driving License Portal");
        System.out.println("Please enter your age: ");
        int age=sc.nextInt();

        if(age >= 18){
            System.out.println("you are eligible to drive");
        }else{
            System.out.println("Beat cycle chalao");
        }































    }
}
