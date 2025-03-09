import java.util.ArrayList;
import java.util.Iterator;
public class Loop {

    public static void main(String[] args) {
        //make a collection
        ArrayList<String> cars =new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Nissan");

        //get the iterator
        Iterator<String> iterator = cars.iterator();


        //loop through a collection
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
    

