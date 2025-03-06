import java.util.ArrayList;
public class InsertItem {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        car.add(4, "Nissan"); // Insert "Nissan" at index 3

        System.out.println(car);
    }
    
}
