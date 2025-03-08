import java.util.HashSet;
public class ItemExistes {
    public static void main(String[] args) {
     
        HashSet<String> student = new HashSet<String>();
        student.add("Saurabh");
        student.add("Gaurav");
        student.add("Abhishek");

        System.out.println(student.contains("Saurabh")); // true
        System.out.println(student.contains("Rahul")); // false
    }
    
}
