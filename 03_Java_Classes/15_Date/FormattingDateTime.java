import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // import the DateTimeFormatter class
public class FormattingDateTime {

    public static void main(String[] args) {

        LocalDateTime datetime = LocalDateTime.now(); // Create a date-time object
        System.out.println("Before formatting: " + datetime); // Output current date-time

        // Format the date-time value
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = datetime.format(dateTimeFormatter);
        System.out.println("After formatting: " + formattedDate); // Output formatted date-time

    }
    
}
