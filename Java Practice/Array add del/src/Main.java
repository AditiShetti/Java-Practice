//Array addition and deletion
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Add element to array
        int a1[] = new int[50];

        System.out.print("Enter the size of array you want: ");
        int size = in.nextInt();

        int i = 0;
        for (i = 0; i < size; i++) {//Enter elements of array
            System.out.print(" Enter elements of array: ");
            a1[i] = in.nextInt();
        }

        System.out.print("Enter position of new element: ");
        int pos = in.nextInt();
        int element = 0;
        if (pos > size || pos < 0) {
            System.out.println("Position should be between 0 and " + size);
            return;
        }
        System.out.print("Enter element you want to add: ");
        element = in.nextInt();

        //Shift all elements to the right to make space for target value.

        for (i = size ; i >= pos; i--) {   //start from last element to pos and shift to right
            a1[i] = a1[i - 1];
        }
        a1[pos] = element; // Now Add element at position you want to
        size++;          // Increment size

        for (i = 0; i < size; i++)  //print array
            System.out.print(a1[i] + " ");


////Deleting element from array
        int a2[] = new int[50];
    
        System.out.print("Enter the size of array you want: ");
        int size= in.nextInt();

        int i=0,pos=-1;
        for ( i=0;i<size;i++) {   //Enter elements of array
            System.out.print(" Enter elements of array: ");
            a2[i] = in.nextInt();
        }

        System.out.print("Enter element to delete: ");
        int x=in.nextInt();

        for (i=0;i<size;i++)
            if (a2[i]==x) {
                pos = i;
                break;
            }

        if(pos==-1)
            System.out.println("Element not found in array.");
        else {
            for (i = pos; i < size-1; i++)
                a2[i] = a2[i + 1];
            size--;
        }

        for (i=0;i<size;i++)  //print array
            System.out.print(a2[i]+" ");
    }
}
