// Avg of array
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int x= in.nextInt();
        float[] a= new float[x];

        int i=0;
        double sum=0;
        for (i=0;i<x;i++) {
            System.out.print("Enter value in array: ");
            a[i] = in.nextFloat();
            sum= sum + a[i];
        }

        for (i=0;i<x;i++) {
            System.out.print(a[i] + " ");
        }

        double avg = sum/x  ;
        System.out.print("\n Avg of the array is "+avg);
    }
}