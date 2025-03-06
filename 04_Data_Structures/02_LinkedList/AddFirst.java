import java.util.LinkedList;
public class AddFirst {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList <String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // use addFirst() to add an item to the beginning of the list
        cars.addFirst("Toyota");
        System.out.println(cars);
    }
    
}
