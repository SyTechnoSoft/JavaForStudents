import java.time.LocalDateTime; // import the LocalDateTime class
public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now(); //Create a date-time object
        System.out.println(dateTime); //Output current date-time
    }
    
}
