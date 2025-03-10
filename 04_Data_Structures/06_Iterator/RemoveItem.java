import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItem {

    public static void main(String args[]){

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(9);
        number.add(12);
        number.add(8);
        number.add(23);


        Iterator<Integer> iterator = number.iterator();

        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(i<10){
                iterator.remove();
            }
        }
        System.out.println(number);
    }
    
}
