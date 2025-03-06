import java.util.LinkedList;
public class RemoveFirst {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> cars = new LinkedList<String>();

        // Add elements to the LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Remove the first element
        cars.removeFirst();
        System.out.println(cars);
    }
}
