
public class Abstraction {

    public static void main(String[] args) {
        Cat cat = new Cat(); // Create a Cat object
        cat.animalSound();
        cat.sleep();
    }

    
}

    //Abstract class
    abstract class Animal {
        // Abstracr method (does not hav a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    class Cat extends Animal {
        public void animalSound() {
            // The body of AnimalSound() is provided here
            System.out.println("The cat says: Meow Meow");
            
        }
    }