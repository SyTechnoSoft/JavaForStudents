
//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
//Example

public class Constructor {
    int x;  // Create a class attribute

    // Create a class constructor for the Constructor class
    public Constructor() {
        x = 5;  // Set the initial value for the class attribute x
    }
    public static void main(String[] args){
        Constructor  constructorObj =new Constructor();
        System.out.print(constructorObj.x);
    }
    
}

//output: 5
