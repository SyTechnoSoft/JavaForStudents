import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // import the DateTimeFormatter class
public class FormattingDateTime {

    public static void main(String[] args) {

        LocalDateTime datetime = LocalDateTime.now(); // Create a date-time object
        System.out.println("Before formatting: " + datetime); // Output current date-time

        // Format the date-time value
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        String formattedDate = datetime.format(dateTimeFormatter);
        System.out.println("After formatting: " + formattedDate); // Output formatted date-time
        System.err.println("dateFormatter: " + datetime.format(dateFormatter));
        System.err.println("dateFormatter2: " + datetime.format(dateFormatter2));
        System.err.println("dateTimeFormatter3: " + datetime.format(dateTimeFormatter3));
        System.err.println("timeFormatter: " + datetime.format(timeFormatter));
        System.err.println("timeFormatter2: " + datetime.format(timeFormatter2));

    }
    
}
