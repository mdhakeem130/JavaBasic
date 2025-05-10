public class IntroToBitwiseOperators4_11 {
    /*
      1 AND Operator(&): Performs on two integer,Each bit of the output is 1 if
        corresponding bits of both operands are 1, otherwise 0'
      2 OR Operator(|): Performs on two integer,Each bit of the output is 1
      if the corresponding bits of both operator are 0,otherwise 1.
      3 XOR Operator(^):Performs on two integer ,Each bit of the output is 1
      if corresponding bits of the operands are different.
      4 NOT Operator(~): Performs a bitwise complement.
      It inverts the bits of its operand (0 becomes 1, and 1 becomes 0)
      5 Left Shift Operator(<<):Shifts the left operand's bits to the left by the number of
      position specified by the right operand,filling the new rightmost bits with zeros.
      6 Right Shift Operator(>>):Shift the left operand's bits to the right,
      If the left Operand is positive,zero are filled into the new leftmost bits,
      if negative,ones are filled in.


                  ***** Decimal To Binary  *****

             Decimal                  Binary      exapmle
               0                        0000
               1                        0001        1*2 power 3  1*2 pow 2   0*2 pow 1 + 0 * 2 pow 0 =8+4+0+0=12  root 2
               2                        0010
               3                        0011
               4                        0100
               5                        0101
               6                        0110
               7                        0111
               8                        1000
               9                        1001
               10                       1010
               11                       1011
               12                       1100
               13                       1101
               14                       1110
               15                       1111


               1 (AND Bitwise example &)->12&13 =12
                12 of binary 1100
                13           1101

                total &   =  1100
                2(OR Bitwise example |)-> 12 | 13 =15

                 1100
                 1101
               = 1101

               3 (XOR Bitwise example &)->7^13 =10
               0111
               1101
              =1010

              4 (NOT Bitwise example ~)->7 =8
              0111
             =1000

             Left Shift Operator(<<):4 << 1
          4=   0100    one shift to the left
               1000   after shifting the left value 8

              L Shift Operator(<<):4 >> 1
          4=   0100    one shift to the left
               0010   after shifting the left value 2

     */
}
