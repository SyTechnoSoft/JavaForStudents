import java.util.HashSet;
public class ClearHashSet {

    public static void main(String[] agr){
        HashSet<String> hset = new HashSet<String>();
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");

        System.out.println("HashSet contains: "+hset);
        
        hset.clear(); // Clearing HashSet
        System.out.println("HashSet cleared: " +hset);
    }
    
}
