import java.util.ArrayList;
import java.util.Collections;
public class Reverse {

    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(5);
        num.add(8);
        num.add(3);
        num.add(1);
        num.add(2);
        num.add(6); 
        num.add(7);
        num.add(4);
        num.add(9);

        Collections.sort(num,Collections.reverseOrder());  // Sort the list in reverse order
        for (int i: num){
            System.out.println(i);
        }


    }
    
}
