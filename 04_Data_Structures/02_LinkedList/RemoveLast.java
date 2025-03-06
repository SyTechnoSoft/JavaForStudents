import java.util.LinkedList;

public class RemoveLast {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> cars = new LinkedList<String>();

        // Add elements to the LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Remove the last element
        cars.removeLast();
        System.out.println(cars);
    }
}
