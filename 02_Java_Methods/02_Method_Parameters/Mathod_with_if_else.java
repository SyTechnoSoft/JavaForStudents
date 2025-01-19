
public class Mathod_with_if_else {
    public static void main(String[] args){
        myMethod("Saurabh Yadav", 22);
        myMethod("Gaurav Yadav", 18);
    }

    static void myMethod(String name, int age){
        if(age>20){
            System.out.println("Hello "+name+" you are eligible for voting");
        }else{
            System.out.println("Hello "+name+" you are not eligible for voting");
        }
    }
    
}
