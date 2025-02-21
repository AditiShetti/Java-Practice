//Convert km to miles
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Enter value in km: ");
    float km= in.nextFloat();
    double miles= 0.621371;
    double ans= km*miles;
    System.out.printf("The value in miles is %.6f", ans);
    }
}