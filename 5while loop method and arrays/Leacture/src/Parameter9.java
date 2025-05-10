public class Parameter9 {
    public static void main(String[] args) {
        //int num =sumTwoNumbers(4,7); //Arguments
        //System.out.println(num); OR
        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(5,9));
        System.out.println(sumTwoNumbers(-67,67));
    }

    public static int sumTwoNumbers(int first,int second){  //Parameter
        System.out.println("First Number received: "+ first);
        System.out.println("Second Number received: "+ second);
       // int sum=first+second;
       //  return sum; //OR
        return first + second;

    }
}
