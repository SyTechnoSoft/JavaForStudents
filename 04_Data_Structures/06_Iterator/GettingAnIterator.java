import java.util.ArrayList;
import java.util.Iterator;

public class GettingAnIterator{
    public static void main(String[] arg){

        //make a collection
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add("World");
        list1.add("!");

        //get an iterator
        Iterator<String> iterator = list1.iterator();


        //print the first item
        System.out.println(iterator.next());
    }

}