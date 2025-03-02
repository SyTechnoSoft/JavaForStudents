
import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args){

        //Create a scanner object
        Scanner scanner = new Scanner(System.in);

        //Output to user
        System.out.println("Enter your name; ");
        //String input
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        //Numerical input
        int age = scanner.nextInt();

        System.out.println("Enter your salery: ");
        //Double input
        double salery = scanner.nextDouble();

        //Output input by user

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salery: "+salery);


    }
}
