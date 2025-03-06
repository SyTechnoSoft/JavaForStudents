import java.util.ArrayList;
public class RemoveAllItem {

    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<String>();
        car.add("Suzuki");
        car.add("Toyota");
        car.add("Honda");
        car.add("Nissan");

        System.out.println("Before removing all items: " + car);

        car.clear();

        System.out.println("After removing all items: " + car);



    }
    
}
