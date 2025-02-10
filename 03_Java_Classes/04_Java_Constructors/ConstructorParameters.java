// Constructors can also take parameters, which is used to initialize attributes.

// The following example adds an int y parameter to the constructor.
// Inside the constructor we set x to y (x=y). When we call the constructor,
// we pass a parameter to the constructor (5), which will set the value of x to 5:

public class ConstructorParameters {
    int x;  // Create a class attribute

    // Create a class constructor

    public ConstructorParameters(int y){
        x=y;
    }

    public static void main(String[] args) {
        ConstructorParameters constructorParameters = new ConstructorParameters(10);
        System.out.println(constructorParameters.x);
    }
}

// Outputs 10