//Reverse a String
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string:" );
        String orignal= in.nextLine();

        int len=orignal.length();
        String rev="";

        for (int i=len-1;i>=0;i--) {
            rev = rev + orignal.charAt(i);
        }
        System.out.println("The reversed string:" + rev);

    }
}