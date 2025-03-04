import java.util.ArrayList;
public class RemoveAnItem {

    public static void main(String[] args) {
        

        ArrayList<String> car = new ArrayList<String>();
        car.add("Suzuki");
        car.add("Toyota");
        car.add("Honda");
        car.add("Mazda");


        System.out.println("Before removing an item: " + car);

        car.remove(1); // Remove the second item

        System.out.println("After removing an item: " + car);


    }
    
}
