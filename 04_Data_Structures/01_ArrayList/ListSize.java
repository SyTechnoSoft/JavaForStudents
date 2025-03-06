import java.util.ArrayList;
public class ListSize {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        int size = list.size();
        System.out.println("Size of the list: " + size);
        System.out.println("Size of the list: " + list.size());
    }
    
}
