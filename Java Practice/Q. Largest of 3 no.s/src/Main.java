// Largest of three numbers
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);

    System.out.println("\n ---Largest of three numbers---");
        int a, b, c;
     System.out.println(" Enter number a:");
     a = in.nextInt();
     System.out.println(" Enter number b:");
     b = in.nextInt();
     System.out.println(" Enter number c:");
     c = in.nextInt();


    if (a == b &&  b== c) {
        System.out.println("All numbers are equal.");
    } else {
         if (a > b && a > c) {
            System.out.println("a is the greatest: " + a);
         } else if (b > a && b > c) {
            System.out.println("b is the greatest: " + b);
         } else
            System.out.println("c is the greatest: " + c);

     }
    }
}