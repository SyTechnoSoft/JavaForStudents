import java.time.LocalTime; // import the LocalTime class
public class CurrentTime {

    public static void main(String[] args){
        LocalTime time=LocalTime.now(); //Create a time object
        System.out.println(time); //Output current time
    }
    
}
