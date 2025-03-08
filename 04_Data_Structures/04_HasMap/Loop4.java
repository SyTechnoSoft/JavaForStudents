import java.util.HashMap;
public class Loop4 {

    public static void main(String[] arg){
        HashMap<String, Integer> student= new HashMap <String, Integer>();
        student.put("Saurabh", 22);
        student.put("Abhishek", 23);
        student.put("Gaurav", 18);
        student.put("Ankur", 23);


        //print keys and values
        for (String i : student.keySet()){
            System.out.println("Name => " + i + " Age => " + student.get(i));
        }
    }
    
}
