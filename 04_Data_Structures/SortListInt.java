import java.util.ArrayList;
import java.util.Collections;
public class SortListInt {

    public static void main (String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);
        numbers.add(4);
        numbers.add(9);
        Collections.sort(numbers);
        for (int i : numbers){
            System.out.println(i);
        }
    }
    
}
