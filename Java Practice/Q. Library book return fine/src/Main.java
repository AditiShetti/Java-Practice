//Library book return fine
import java.util.Scanner;
class Library {
    int acc_num;
    String title;
    String author;
    //int days;
    int fine;

    void input(int acc_num1,String title1,String author1){
        acc_num= acc_num1;
        title = title1;
        author=author1;
    }
    void calculate(Scanner in){
        int days;
        //int fine;
        System.out.println("Enter the number of days the book is late:");
        days=in.nextInt();
        fine= days*2;
    }

    void display(){
        System.out.println("Accession_Number \t Title \t Author");
        System.out.println(acc_num +"\t\t"+ title + "\t" +author);
        System.out.println("Fine: "+fine);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library a= new Library();

        System.out.println("Enter accession number:");
        int acc_num1=in.nextInt();
        in.nextLine();
        System.out.println("Enter the book title :");
        String title1= in.nextLine();
        System.out.println("Enter author name:");
        String author1=in.nextLine();

        a.input(acc_num1,title1,author1 );
        a.calculate(in);
        a.display();


    }
}