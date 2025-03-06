import java.util.ArrayList;
public class AccessAnItem {

    public static void main (String[] args){
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        System.out.println(car.get(0)); // Output: Volvo
        System.out.println(car.get(2)); // Output: Ford
    }
    
}
