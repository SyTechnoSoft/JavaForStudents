import java.util.Scanner;

public class Hollow_Pyramid {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces in the row
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*"); // Print stars at the edges
                } else {
                    System.out.print(" "); // Print spaces in between
                }
            }

            // Move to the next line
            System.out.println();
        }

        // Print the last row of the pyramid (base)
        for (int i = 1; i <= (2 * n - 1); i++) {
            System.out.print("*");
        }
    }
    
}
