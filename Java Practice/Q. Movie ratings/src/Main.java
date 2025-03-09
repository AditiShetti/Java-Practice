//MovieMagic ratings given to a movie.
import java.util.*;
class MovieMagic {
    Scanner in = new Scanner(System.in);
    int year;
    String title;
    float rating;
    String message;

    MovieMagic(){                                 //constructor to initialise data members
         year=0;
         title=" ";
         rating=0.0f;
    }
    void input(){
        System.out.print("Enter year the movie was released: ");
        year=in.nextInt();
        System.out.print("Enter title of the movie: ");
        title=in.nextLine();
        in.nextLine();
        System.out.print("Enter rating of the movie between 0 and 5: ");
        rating=in.nextFloat();
    }

    void display(){
        if (rating<=2.0)
            message="Flop";
        else if(rating>=2.1 && rating<=3.4) {
            message = "Semi-Hit";
        }
        else if (rating>=3.5 && rating<=4.5) {
            message = "Hit";
        }
        else if (rating>4.5) {
            message = "Super-Hit";
        }
        System.out.println("The movie title: "+title+" was released in the year: "+ year);
        System.out.println("With rating: "+rating +" the movies was a : "+message);
    }

    public static void main(String[] args) {
     MovieMagic a= new MovieMagic();
     a.input();
     a.display();
    }
}
