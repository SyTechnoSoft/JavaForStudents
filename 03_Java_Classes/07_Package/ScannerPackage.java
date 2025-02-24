import java.util.Scanner;
public class ScannerPackage {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age =scanner.nextInt();
        System.out.println("Name: "+name +"\nAge: "+age);
        
    }

    

}
