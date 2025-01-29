public class OperatorPrecedence4_9 {
    public static void main(String[] args) {
        // Operator Precedence: Determines the evaluation order of operators in an expression
        //based on their priority levels

        //Associativity: Defines the order of operation for operators with the same precedence
        //usually left-to-right or right-to-left

      //  Operator           Category                      Precedence              Associativity
      //    Unary              postfix                       a++,a--                  Right to left
     //                        prefix                   ++a,--a,+a,a,~,!              Right to left
    //    Arithmetic           Multi                     *,/,%                        Left  to Right
    //                         Addition                  +,-                          Left  to Right
    //    Shift                Shift                     <<,>>,>>>                    Left  to Right
    //    Relational           Comparison                <,>,<=,>=                    Left  to Right
    //                         equality                  ==,!=                        Left  to Right
    //   Bitwise               bitwise AND                &                           Left  to Right
    //                         bitwise exclusive OR       ^                           Left  to Right
    //                         bitwise inclusive OR       |                           Left  to Right
    //   Logical               Logical AND                &&                          Left  to Right
    //                         Logical OR                 ||                          Left  to Right
    //   Ternary               Ternary                    ?:                          Right to Left
    //   Assignment            assignment               =,+=,-=,*=,/=,%=.&=,          Right to Left
    //                                                  ^=,\=,<<=,>>=,>>>=
    }

}
