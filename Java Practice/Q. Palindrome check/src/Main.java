//Palindrome check
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= in.nextInt();

        int a=num;
        int remainder=0,d=0;
        while (num>0) {
            remainder = num % 10;  // take last dig /remaining
            d = (d * 10) + remainder;  //new num
            num = num / 10;   //del last value
        }
        if (d==a)
            System.out.println("This is a palindrome");
        else
            System.out.println("Not a palindrome");

    }
}