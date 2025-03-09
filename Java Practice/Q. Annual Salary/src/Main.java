//Calculate Annual Salary of a Teacher  using Class and Object
import java.util.*;

class Salary {
    Scanner in = new Scanner(System.in);
    String name;
    String add;
    long phone;
    String subj;
    String specialisation;
    double monthly_sal;
    double annual_sal;
    double income_tax;

   void input(){
       System.out.print("Enter name of Teacher:");
       name=in.nextLine();
       System.out.print(" Enter address of the teacher:");
       add=in.nextLine();
       System.out.print(" Enter phone no. of Teacher:");
       phone=in.nextLong();
       in.nextLine();
       System.out.print(" Enter subject of the teacher:");
       subj=in.nextLine();
       System.out.print(" Enter specialisation of the teacher:");
       specialisation=in.nextLine();
       System.out.print(" Enter monthly salary of the teacher:");
       monthly_sal=in.nextDouble();

   }
   void calculate(){
       income_tax=0;
       annual_sal= monthly_sal*12;
       income_tax=(annual_sal>175000)? (0.05 * annual_sal):0;   //Using ternary operator
   }

   void display(){
       System.out.println("\n--- Teacher's Details ---");
       System.out.println(" Teacher's name : "+ name);
       System.out.println(" Teacher's address : "+ add);
       System.out.println(" Teacher's phone number :"+ phone);
       System.out.println(" Teacher's subject: "+ subj);
       System.out.println(" Teacher's specialisation : "+ specialisation);
       System.out.println(" Teacher's monthly salary : "+ monthly_sal);
       System.out.println(" Teacher's annual salary : "+ annual_sal);
       System.out.println(" Teacher's income tax : "+ income_tax);

   }

    public static void main(String[] args) {
    Salary a= new Salary();
    a.input();
    a.calculate();
    a.display();

    }
}
