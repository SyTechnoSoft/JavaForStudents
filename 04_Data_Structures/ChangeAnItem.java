import java.util.ArrayList;
public class ChangeAnItem {

    public static void main(String[] args) {
        
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");

        car.set(0, "Nissan"); // Change the first item to "Opel"

        System.out.println(car);

    }
}
    

