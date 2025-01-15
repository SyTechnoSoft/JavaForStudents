import java.util.*;
public class Pyramid {
    public static void main(String[] args){
        int rows;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
    
} 
