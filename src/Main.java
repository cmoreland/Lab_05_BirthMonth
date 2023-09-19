import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your birth month as an integer: ");
        if(in.hasNextInt()){
            int birthMonth = in.nextInt();
            if (birthMonth <= 12 && birthMonth >= 1){
                System.out.println("Your birth month is: " + birthMonth);
            }
            else {
                System.out.println("That is not between 1 and 12. Try again.");
            }
        }
        else {
            System.out.println("That's not an integer. Try again.");
        }
    }
}