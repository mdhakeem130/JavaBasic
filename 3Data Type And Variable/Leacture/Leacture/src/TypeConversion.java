public class TypeConversion {
    public static void main(String[] args) {
        // 1 Automatic type conversion (Widening -implicit)
        //byte-->short-->int-->long-->float-->double

        //2 Narrowing (explicit)
        //byte<--short<--int<--long<--float<--double

        //1
        float myFloat=5L;
        System.out.println(myFloat);
        //2
        //float myFloat1=(float)5d; //Narrowing (explicit)
       // System.out.println(myFloat1);

        //int myInt=5.0f;//it will some data if we do typecast(explicit)
           int myInt=(int)5.45f;
        System.out.println(myInt);

        //implicit
        long big=45;
        float dec=3;
        double d=3.4f;

        //explicit
        float eDec=(float) 4.5;
        long  eBig=(long) 5.4;
        int   eInt= (int) 3.4;

        //we complete
        //1 Variable
        //2 Data Types
        //3 Naming Conventions
        //4 Literals
        //5 Escape Sequences
        //6 Keywords
        //7 User Input
        //8 Type Conversion and Casting


    }
}
