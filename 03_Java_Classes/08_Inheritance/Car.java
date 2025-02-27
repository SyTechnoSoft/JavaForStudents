
class Vehicle {
    protected String brand = "Nissan";       // Vehicle attribute
    public void honk() {                     // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}



public class Car extends  Vehicle {
    private final String modelName = "Sunny";    // Car attribute
    public static void main(String [] args){

        // Create a myCar object
        Car myCar = new Car();
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
    
}


/*
 * 
 * Did you notice the protected modifier in Vehicle?

We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.

The final Keyword
If you don't want other classes to inherit from a class, use the final keyword:

If you try to access a final class, Java will generate an error:

final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
The output will be something like this:

Main.java:9: error: cannot inherit from final Vehicle
class Main extends Vehicle {
                  ^
1 error)
 * 
 */
