//Check if a number is Prime or not
//Prime no within a range
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//    System.out.print("Enter a number to check if prime or not n:");
//    int n= in.nextInt();
//    int flag=0;
//    for (int i=2;i<n;i++)
//        if (n%i==0) {
//            flag = 1;
//            break;
//        }
//
//    if (flag==0)
//        System.out.print(n+" is a prime number");
//    else
//        System.out.print(n+" is not a prime number");

        //Prime nos within a range

     System.out.print("Enter start of range");
     int start= in.nextInt();
     System.out.print("Enter end of range");
     int end= in.nextInt();
     int flag=0;
     for (int i=start;i<end;i++){
         if (i<2)
             continue;
             flag=0;
         for (int j=2;j<i;j++)
             if(i % j==0) {
                 flag = 1;
                 break;
             }

      if (flag==0)
          System.out.println(i+" ");
     }


    }
}