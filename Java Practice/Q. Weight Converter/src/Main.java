import  java.util.*;
//Kgs to pounds and vice-versa converter

public class Main {

    public static double kgToLbs(float kg){
        return kg*2.20462;

    }

    public static double lbsToKg(float lbs){
        return lbs/ 2.20462;
    }


    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("---------------Weight Converter ------------------");
     System.out.println("Enter 1 : To convert from kg to pounds." );
     System.out.println("Enter 2 : To convert from pounds to kg");

     System.out.print("Your choice: ");
     int inp=in.nextInt();

     switch(inp) {
         case 1:
             System.out.print("Enter value for kg:");
             float kgInput= in.nextFloat();
             double lbs= kgToLbs(kgInput);
             System.out.printf("For kg %.2f, pounds is = %.4f",kgInput,lbs);
             break;
         case 2:
             System.out.print("Enter value for pounds:");
             float lbsInput= in.nextFloat();
             double kgs= lbsToKg(lbsInput);
             System.out.printf("For lbs %.2f, kg is = %.4f",lbsInput,kgs);
             break;

         default:
             System.out.println("Invalid choice! Please enter 1 or 2.");
     }

     in.close();
    }
}