//Sum of series
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);

    //a. sum=1+1/2+1/3+1/4+...n
//    System.out.println("Enter n value : ");
//    int n= in.nextInt();
//    double sum=0;
//    for (int i=1;i<=n;i++) {
//        sum = sum + 1.0 / i;
//    }
//    System.out.println("The sum of the series is "+ sum);

    //b. Sum of series 1 – 1/2 + 1/3 – 1/4...1/n
    System.out.println("Enter n1 value : ");
    int n1=in.nextInt();
    double sum1=0;
    int i;
    for ( i=1;i<=n1;i++)
//        if (i%2==0)
//            sum1= sum1- 1.0/i;
//        else
//            sum1= sum1 + 1.0/i;
    sum1+= (i%2==0)? (-1.0/i): (1.0/i); //ternary operator used with for loop
    System.out.println("The sum of the series is "+ sum1);

    }
}