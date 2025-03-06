import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Rolls Royce");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Chevrolet");
        cars.add("Ferrari");
        cars.add("Lamborghini");

        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }


    }
}

/*Another useful class in the java.util package is the Collections class,
which include the sort() method for sorting lists alphabetically or numerically:*/


