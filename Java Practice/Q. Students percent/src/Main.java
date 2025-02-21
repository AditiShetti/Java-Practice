//Students percent (Code with Harry)
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("---Enter marks out of 100---");
    System.out.print("Enter marks for English: ");
    int s1= in.nextInt();
    System.out.print("Enter marks for Math: ");
    int s2= in.nextInt();
    System.out.print("Enter marks for Science: ");
    int s3= in.nextInt();
    System.out.print("Enter marks for History: ");
    int s4= in.nextInt();
    System.out.print("Enter marks for Geography: ");
    int s5= in.nextInt();

    int sum=s1+s2+s3+s4+s5;
    System.out.println("Your total marks is "+ sum);
    double perc= (sum/500.0)*100;
    System.out.printf("The student scored %.2f%%\n", perc);
    }
}