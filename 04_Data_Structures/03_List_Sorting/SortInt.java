import java.util.ArrayList;
import java.util.Collections;

public class SortInt {

    public static void main (String[] args){

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(5);
        number.add(8);  
        number.add(3);
        number.add(1);
        number.add(2);
        number.add(6);

        Collections.sort(number); // Sort the list
        for (int i : number){
            System.out.println(i);
        }
    }
    
}
//Sort an ArrayList of Integers numerically in ascending order:

