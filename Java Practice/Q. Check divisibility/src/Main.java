// Check if no. is divisible by 3 and 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);

    System.out.println("\n --- Check if number is Divisible by 3 and 5 ---");
    int x;
    System.out.println(" Enter a number:");
    x =in.nextInt();

     if (x % 3 ==0 && x%5== 0) {
         System.out.println(" The number " + x+ " is divisible by both 3 and 5");
     }
     else if (x% 3 ==0 && x% 5!= 0)  {
            System.out.println("The number " + x+ " is divisible only by 3" );
     }
     else if (x% 3 !=0 && x% 5== 0)  {
            System.out.println("The number " + x+ " is divisible only by 5" );
     }
     else if (x% 3 !=0 && x% 5!= 0)  {
            System.out.println("The number " + x+ " is neither divisible by 3 or 5" );
     }
    }
}