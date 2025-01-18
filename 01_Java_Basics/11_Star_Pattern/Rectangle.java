import java.util.*;

public class Rectangle {
    public static void main(String[] saurabh){
        int row;
        int col;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        row=scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        col=scanner.nextInt();
        scanner.close();
        System.out.println("Rectangle is:- ");

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print("*");

            }
            System.out.println();
        }
         

    }
}
