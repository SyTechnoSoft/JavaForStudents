public class String_with_Int{
    public static void main(String [] args){

        String nameAge=myMethod("Saurabh Yadav ", 22);
        System.out.println(nameAge);
    }
    static String myMethod(String name, int age){
        return name + age;

    }

}