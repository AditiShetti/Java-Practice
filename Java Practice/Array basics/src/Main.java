//Array basics
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0, j = 0;
        //1. Declare and memory allocation together
        int[] a = new int[5];
        //2. Declare first and memory allocation later
        int[] b;
        b = new int[7];

        //initialisation
        a[0] = 20;
        b[1] = 10;

        // Declaration, memory allocation and initialisation together.
        int[] c = {6, 51, 4, 33, 20, 103};


        //User enters values in array
        System.out.print("Enter length of array: ");
        int x=in.nextInt();
        int[] d= new int[x];

        for ( i=0;i<x;i++) {
            System.out.print("Enter value in array: ");
            d[i] = in.nextInt();
        }
        for ( i=0;i<x;i++) {
            System.out.print(d[i]+ " ");
        }

        //a.print array using for loop
//        for ( i=0;i< c.length;i++)
//            System.out.print("\n" + c[i]);

//        System.out.println(d[0]); //b.print specific element

        //c. print using for each loop
//        for(int element:c)
//            System.out.println(element);


        //Sum of elements
        int sum=0;
        for ( i=0;i< d.length;i++) {
            sum = sum + d[i];
        }
            System.out.println("\n The sum of the array is : "+sum);

        //Print in Reverse
//        for ( i=(c.length)-1;i>=0 ;i--)
//           System.out.print(c[i]+ " ");

        //print elements which are even (not index)
//        for( i=0;i<c.length;i++)
//            if (c[i]%2 == 0)
//                System.out.println(c[i]);


        //MULTIDIMENSIONAL ARRAY

        int[][] arr = new int[3][4];

        for (i = 0; i < 3; i++){
            for (j = 0; j < 4; j++) {
                System.out.print("Enter elements in matrix: ");
                arr[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println(" ");
        }


    }
}