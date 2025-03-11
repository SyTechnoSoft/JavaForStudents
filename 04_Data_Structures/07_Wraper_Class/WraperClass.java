import  java.util.ArrayList;
public class WraperClass {

    public static void main(String [] args){
        // ArrayList<int> number =new ArrayList<int>(); // Error

        ArrayList<Integer> number =new ArrayList<Integer>(); // Correct
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);

        System.out.println("Number: "+number);
    }


    
}
