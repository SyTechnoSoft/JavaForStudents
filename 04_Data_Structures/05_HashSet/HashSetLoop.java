import java.util.HashSet;

public class HashSetLoop {
    
    public static void main(String[] arg){
        HashSet<String> hset = new HashSet<String>();
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        hset.add("Banana");

        for(String s : hset){
            System.out.println(s);
        }
    }

}
