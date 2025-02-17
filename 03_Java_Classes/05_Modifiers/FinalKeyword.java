//If you don't want the ability to override existing attribute values, declare attributes as final:


public class FinalKeyword {

    final int x = 10; // x is a final attribute
    final double  PI = 3.14; // PI is a final attribute

    public static void main(String[] args){
        FinalKeyword finalKeyword = new FinalKeyword();
       // finalKeyword.x = 50; // will generate an error: cannot assign a value to a final variable
       // finalKeyword.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(finalKeyword.x);

    }
    
    
}
