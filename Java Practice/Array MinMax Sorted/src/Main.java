//Array miniun and maximum element.
// Check if array is sorted
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array you want: ");
        int size = in.nextInt();

        int a[]= new int[size];

// Check if array is sorted
        int i=0;
        boolean ascending= true,descending=true;
        for (i = 0; i < size; i++) {//Enter elements of array
            System.out.print(" Enter elements of array: ");
            a[i] = in.nextInt();
        }

        System.out.print("\n Array: ");
        for (i = 0; i < size; i++)  //print array
            System.out.print(a[i] + " ");

         // Check if array is sorted
        for (i=0;i < size-1; i++){
            if (a[i]>a[i+1]) {  //for DESC
                ascending=false;
            }
            else if (a[i]<a[i+1]) {  //for ASC
                descending=false;
            }
        }

        if (ascending)
            System.out.println("\n This array is sorted in Ascending order");
        else if (descending)
            System.out.println("\n This array is sorted in Descending order");
        else
            System.out.println("\n This array is not sorted");

//Max in array

        //int max=0,min=0;
        int max=a[0];
        for (i=1;i<size;i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.print("\n The max element is:"+ max);

//Minimum in array
        int min=a[0];
        for (i=1;i<size;i++) {
            if (min >a[i] )
                min = a[i];
        }
        System.out.print("\n The min element is:"+ min);
    }
}