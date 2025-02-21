//Profit or loss
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("\n --- Profit or Loss ---");
    int cp, sp;
    System.out.println("Enter cost price: ");
    cp = in.nextInt();
    System.out.println("Enter selling price: ");
    sp = in.nextInt();

        if (cp < sp) { //profit
         System.out.println("Actual profit:"+ (sp - cp) + " " + "Profit percent wise:"+ ((sp - cp) * 100 )/ cp +"%");
     } else if (cp > sp) {//loss
         System.out.println("Actual loss:"+ (cp - sp) + " " + "Loss percent wise:"+ ((cp - sp) * 100) / cp +"%");
     } else if (cp == sp) {
         System.out.println("Neither profit nor loss");
     }
    }
}