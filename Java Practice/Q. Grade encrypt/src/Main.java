//Grade encryption and decryption
public class Main {
    public static void main(String[] args) {
    //While sending char encrypt by adding value by 8. then decrypt it later .
    char grade='B';
    grade= (char) (grade +8);
    System.out.println(grade);

    grade= (char) (grade-8);
    System.out.println(grade);
    }
}
