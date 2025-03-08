import java.util.HashSet;
public class RemoveItem {

    public static void main(String[] agdf){
        HashSet<String> student= new HashSet<String>();
        student.add("Saurabh");
        student.add("Gaurav");
        student.add("Abhishek");

        System.out.println("Before removing: "+student); // [Saurabh, Gaurav, Abhishek]

        student.remove("Saurabh");
        System.out.println("After removing: "+student); // [Gaurav, Abhishek]

    }
    
}
