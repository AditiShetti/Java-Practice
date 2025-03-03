//Bookfair book discounts
import java.util.*;
class Laptop {
    Scanner in = new Scanner(System.in);
    String name;
    double price;
    double discount;
    double new_price;

    Laptop(){                                 //constructor to initialise data members
        name=" ";
        price=0.0d;
        discount=0.0d;
    }
    void input(){
        System.out.print("Enter name of the laptop : ");
        name =in.nextLine();
        System.out.print("Enter price of the laptop : ");
        price=in.nextInt();
    }

    void display(){
        if (price<=25000)
            discount= 0.05f* price;
        else if (price>=25001 && price<=50000)
            discount= 0.075f * price;
        else if (price>=50001 && price <=100000)
            discount= 0.10f * price;
        else if (price >100000)
            discount= 0.15f * price;

        new_price= price - discount;
        System.out.println("For price : "+price +" discount is: "+discount);
        System.out.println("The new price of laptop is: "+ new_price);
    }

    public static void main(String[] args) {
        Laptop a= new Laptop();
        a.input();
        a.display();
    }
}