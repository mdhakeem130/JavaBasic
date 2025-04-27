import java.util.Scanner;

public class PrintPattern39 {
    public static void main(String[] args) {
       printPattern39();
    }
    private static void printPattern39() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Pattern Program\n");
        System.out.print("Please enter  number of rows : ");
        int rows= sc.nextInt();
        //printFirstPattern1ORRightHalfPyramid(rows);
        //printSecondPattern1ORReverseRightHalfPyramid(rows);
        printThirdPattern1OLeftHalfPyramid(rows);
    }

    private static void printThirdPattern1OLeftHalfPyramid(int maxRows) {
        System.out.println("\nhere is left half pyramid");
        int rows=maxRows;
        while(rows > 0){
            // this loop prints spaces
            int j=0;
            while(j < rows -1){
                System.out.print(" ");
                j++;
            }
            // this loop prints stars
            int i=0;
            while(i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }


    }

    private static void printSecondPattern1ORReverseRightHalfPyramid(int maxRows) {
        int rows =maxRows;
        while (rows > 0){
            int i=0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    private static void printFirstPattern1ORRightHalfPyramid(int maxRow) {
        int rows=0;
        while(rows < maxRow){
            System.out.print("*");
            int i=0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

}
