//Bookfair book discounts
import java.util.*;
class BookFair {
    Scanner in = new Scanner(System.in);
    String Bname;
    double price;
    double discount;
    double new_price;

    BookFair(){                                 //constructor to initialise data members
        Bname=" ";
        price=0.0d;
    }
    void input(){
        System.out.print("Enter name of the book : ");
        Bname =in.nextLine();
        System.out.print("Enter price of the book : ");
        price=in.nextInt();
    }

    void display(){
        if (price<=1000)
            discount= 0.02f* price;
        else if (price>1000 && price<=3000)
            discount= 0.10f * price;
        else if (price>3000)
            discount= 0.15f * price;

        new_price= price - discount;
        System.out.println("For price: "+price +" discount is: "+discount);
        System.out.println("The new price is: "+ new_price);
    }

    public static void main(String[] args) {
        BookFair a= new BookFair();
        a.input();
        a.display();
    }
}