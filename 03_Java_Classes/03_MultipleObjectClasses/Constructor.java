public class Constructor {
    
    int x; //Create a class attribute

    //Create a class constructor for the Constructor class
    public Constructor(){
        x=50; //Set the initial value for the class attribute x
    }

    //Main method
    public static void main(String[] arg){
        //Create an object of the Constructor class (this will call the constructor)
        Constructor constructorObj = new Constructor();
        System.out.println(constructorObj.x); //Print the value of x
    }
}
