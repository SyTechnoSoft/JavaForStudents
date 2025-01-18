
public class Widening_Casting {
    public static void main(String[] args) {
    
        int myInt = 9;
        long myLong = myInt; // Automatic casting: int to long
        float myFloat = myLong; // Automatic casting: long to float
        double myDouble = myFloat; // Automatic casting: float to double
        
        System.out.println(myInt);      // Outputs 9
        System.out.println(myLong);     // Outputs 9
        System.out.println(myFloat);    // Outputs 9.0
        System.out.println(myDouble);   // Outputs 9.0
    
        /*Widening casting is done automatically when passing a smaller size type to a larger size type:

 */
    
    }
    
}
