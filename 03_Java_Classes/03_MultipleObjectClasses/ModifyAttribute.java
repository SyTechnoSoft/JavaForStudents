public class ModifyAttribute {

    int x=10;
    //or 
    //int x;
    public static void main(String[] args){
        ModifyAttribute myObj=new ModifyAttribute();
        System.out.println(myObj.x); //optuput is 10
        myObj.x=40;
        System.out.println(myObj.x); //output is 40
    }
    
}
