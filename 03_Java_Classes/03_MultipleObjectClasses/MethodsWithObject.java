public class MethodsWithObject {
    
    //Create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    //Create a speed() method
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " +maxSpeed);

    }
    //Inside main, call the methods on the myCar object

    //Main method
    public static void main(String[] args){
        MethodsWithObject methodsWithObject =new MethodsWithObject();
        methodsWithObject.fullThrottle();
        methodsWithObject.speed(100);
    }
}

// Output
// The car is going as fast as it can!
// Max speed is: 100
