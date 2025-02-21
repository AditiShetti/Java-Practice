//Sum and Factorial of a number
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("\n--- Sum of n Natural Numbers ---");
    System.out.println("Enter value of n: ");
    int n=in.nextInt();

    //Sum of n natural numbers
    int summ =0;
    for (int i=1;i<=n;++i){
            summ= summ +i;
    }
        System.out.println(summ);

    // Factorial of a numbers.
    System.out.println("\n --- Factorial of a number ---");
    System.out.println("Enter no. to find factorial: ");
    int no=in.nextInt();
    int fact=1;
    for (int i =1;i<=no;i++){
        fact= fact * i;
    }
    System.out.println("The factorial of your no. is "+ fact);


    }
}