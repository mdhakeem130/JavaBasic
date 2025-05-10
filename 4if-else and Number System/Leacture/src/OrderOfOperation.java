public class OrderOfOperation {
    public static void main(String[] args) {
      //   B        O(not use)  D          M       A        S
      // Bracket    Order    Divide     Multiply  Add    Subtract
      //   ()        √a a*a      ÷   or     *       +        -
      //Parentheses  Exponents   Multiply or Divide  Add    Subtract
      //   P            E           M          D      A        S

      //9  ÷ 3 * 2 ÷ 6
        //----->  -->
      //8 - 5 + 7 - 1


        System.out.println(8-3*3);
        System.out.println(9/3/3); // 9/3 =3  than 3/3
        //if we want first calculate 3/3 than we need to add ()
        System.out.println(9/(3/3));

        //if we want first calculate 3/3+2 than we need to add ()
        System.out.println(9/(3/3+2));//9/3 =3































































































    }
}
