//An inner class can also be static, which means that you can access it without creating an object of the outer class:


public class StaticInnerClass {

    public static void main(String[] args){
        OuterClass.InnerClass myInnerClass = new OuterClass.InnerClass();
        System.out.println(myInnerClass.y);
    }

}

class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}