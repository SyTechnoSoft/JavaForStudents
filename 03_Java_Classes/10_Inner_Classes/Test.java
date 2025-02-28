
public class Test {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.y + outerClass.x);

    }
    
}

class OuterClass {
    int x=100;
    class InnerClass {
        int y=5;
    }
}
