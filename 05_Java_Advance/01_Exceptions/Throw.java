public class Throw {
    public static void main(String[] args){

        //checkAge(15);// Set age to 15 (which is below 18...)
        checkAge(20);// Set age to 20 (which is above 18...)

    }

    static void checkAge(int age){
        if (age< 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    
}
//output
// Access granted - You are old enough!