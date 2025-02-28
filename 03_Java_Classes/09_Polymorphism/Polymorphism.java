
public class Polymorphism {

    public static  void main(String[] args){
        // Creating an object of the class Animal
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
        myCat.animalSound();
    }
    
}

        // Creating an class of the class Animal
        class Animal {
            public void animalSound() {
                System.out.println("The animal makes a sound");
            }
        }

        // Creating an class of the class Dog
        class Dog extends Animal {
            public void animalSound() {
                System.out.println("The dog says: bow wow");
            }
        }
        // Creating an class of the class Pig
        class Pig extends Animal {
            public void animalSound() {
                System.out.println("The pig says: wee wee");
            }
        }
        

        // Creating an class of the class Cat
        class Cat extends Animal {
            public void animalSound() {
                System.out.println("The cat says: meow meow");
            }
        }


