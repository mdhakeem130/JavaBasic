public class Function5 {
    public static void main(String[] args) {
       // System.out.println("In main method ");
      //  greetUser();
       // System.out.println("Method calling complete");
       // greetUser();
       printFirstPattern();
      // printSecondPattern();
    //   printThirdPatter();

    }

    public static void printFirstPattern(){
        //need to understand

       /* System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");*/

        int rows=0;
        while (rows < 20)
        {
            System.out.print("*");
            int i=0;
            while (i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }


    public static void printSecondPattern()
    {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void printThirdPatter(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void greetUser(){
        System.out.println("Good Morning from Java");
    }

}
