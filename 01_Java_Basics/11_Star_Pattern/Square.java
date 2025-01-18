
import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
        int n;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of stars: ");
        n = scanner.nextInt();
        scanner.close();

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
