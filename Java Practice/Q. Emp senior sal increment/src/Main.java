//Calculate Senior employee increment using Class and onjects.
import java.util.Scanner;
class Increment {
    String name;
    int age;
    double basic;
    double updated_basic;
    double increment=0;

    void getData(String name1,int age1,double basic1 ){
    name= name1;
    age=age1;
    basic=basic1;

    }

    void calculate(){
        if (age<=45) {
            increment = 0.10 * basic;
            updated_basic = basic + increment;
        }
        else if (age>45 && age<56){
            increment = 0.15 * basic;
            updated_basic = basic + increment;
        }
        else if (age>=56) {
            increment = 0.20 * basic;
            updated_basic = basic + increment;
        }
    }

    void display(){
        System.out.println("Name \t\t Age \t Updated Basic");
        System.out.println(name+" \t\t "+age+"\t\t"+updated_basic);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of employee: ");
        String name1=in.nextLine();
        System.out.println(" Enter age of employee:");
        int age1=in.nextInt();
        System.out.println(" Enter basic salary of employee:");
        double basic1=in.nextDouble();

        Increment a= new Increment();

        a.getData(name1,age1,basic1);
        a.calculate();
        a.display();

    }
}