import java.util.HashMap;
public class AccessItem {
    public static void main(String[] args){
        //create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");

        // Access an item
        System.out.println(capitalCities.get("India"));
    }
    
}
