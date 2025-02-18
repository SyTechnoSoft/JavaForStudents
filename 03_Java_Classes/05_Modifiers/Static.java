public class Static {

    // Static method
    public static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");

    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        //Calling static method
        myStaticMethod();
        // Calling public method
        Static obj = new Static();
        obj.myPublicMethod();
        }
    
}
