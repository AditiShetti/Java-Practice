//Fibonacci Series
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter n for Fibonacci series: ");
    int n=in.nextInt();
    int first=0,second=1,next=0;

    for (int i=0;i<n;i++) {
        if (i<=0)
            next = i;

        else {
            next = first + second;
            first = second;
            second = next;
        }
    }
        System.out.println(" "+ next);
    }
}