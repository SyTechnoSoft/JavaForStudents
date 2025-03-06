import java.util.LinkedList;
public class AddLast {

    public static void main(String [] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // use addLast() to add an item to the end of the list
        cars.addLast("Nissan");
        System.out.println(cars);
    }
    
}
