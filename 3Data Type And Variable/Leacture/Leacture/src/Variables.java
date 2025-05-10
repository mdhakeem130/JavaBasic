public class Variables {
    public static void main(String[] args) {
        int myNumber=865;
        // DataType int  Identifier myNumber Literals 865
        // Identifier -> the only allowed for identifier
        // are all alphanumeric characters
        //([A-Z],[a-z],[0-9],$(dollar sign)and '-'(underscore))
        //should not start with digits[0-9],and can not use keywords or reserved words
        // identifiers are case-sensitive

        // int int =8  invalid
        //int public =8 invalid
        // int class =4 invalid
        // int 87dfas=90  invalid

        int yourNumber=0;
        System.out.println(yourNumber);
        yourNumber=865;
        System.out.println(yourNumber);
        yourNumber=45;
        System.out.println(yourNumber);

        float myFloat=5;
        double myDouble=6.98766;
        System.out.println(myDouble);
        System.out.println(myFloat);

        boolean isVegetarian=true;
        System.out.println(isVegetarian);

        String wishes="Good Morning";
        System.out.println(wishes);

        char myCharacter='k';

        // float newFloat="Hello_Float"; invalid

    }
}