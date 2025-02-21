//Math functions
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("\n--- Use of Math function ---");
    // Base and power, Abs, max, min ,ceil, floor,

        System.out.println(" \n--- Base and Power ---"); //Base and power
        System.out.println("Enter max power y :" );
        double y=in.nextDouble();
        System.out.println("Enter base x :" );
        double x=in.nextDouble();

        double sum=0,total_sum=0;
        for (int i=1;i<=y;i++) {
            sum = Math.pow(x, i);
            System.out.println(sum);
            total_sum= sum + Math.pow(x, i);
        }
        System.out.println("The total sum of the numbers is : "+total_sum);


        System.out.println("\n--- Absolute value ---");
        int val; //absolute value
        System.out.println("Enter a positive/negative integer value: ");
        val = in.nextInt();
        int abs_val = Math.abs(val);
        System.out.println("The absolute value of the integer is " + abs_val);


        // Max and Min value out of 4 numbers
        System.out.println("\n ---Max and min value of 4 numbers ---");
        System.out.println("Enter number 1:");
        int b = in.nextInt();
        System.out.println("Enter number 2:");
        int c = in.nextInt();
        System.out.println("Enter number 3:");
        int d = in.nextInt();
        System.out.println("Enter number 4:");
        int e = in.nextInt();
        int min_val = Math.min(Math.min(b, c), Math.min(d, e));
        int max_val = Math.max(Math.max(b, c), Math.max(d, e));
        System.out.println(" The minimum value is " + min_val + " and maximum value is " + max_val);

        // ceil and floor
        System.out.println("\n ---Ceil and Floor value of a decimal no.---");
        System.out.println("Enter a decimal no. :");
        double f = in.nextDouble();
        double ceiling = Math.ceil(f);
        double floor = Math.floor(f);
        System.out.println("The Ceil value is " + ceiling + " the Floor value is " + floor);

        //Square root of a number
        System.out.println("\n ---Square root of a number---");
        System.out.println("Enter a number to find square root: ");
        int num = in.nextInt();
        double sqrt_num = Math.sqrt(num);
        System.out.println(" The square root of the the number is "+ sqrt_num);
    }
}