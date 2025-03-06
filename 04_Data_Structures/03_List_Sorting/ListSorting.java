//Sort an ArrayList of Strings alphabetically in ascending order:


import java.util.ArrayList;
import java.util.Collections;
public class ListSorting {
    
    public static void main(String[] arg){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        Collections.sort(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
    
}
