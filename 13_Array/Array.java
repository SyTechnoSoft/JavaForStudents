import java.util.Arrays;

public class Array {

    public static void main(String[] args){
        String[] name ={"Saurabh Yadav", "Abhishek Yadav", "Gaurav Yadav", "Aashu Yadav"};
        int[] num = {10, 20, 30, 40, 50};
        System.out.println(name); //[Ljava.lang.String;@4517d9a3
        System.out.println(Arrays.toString(name)); //[Saurabh Yadav, Abhishek Yadav, Gaurav Yadav, Aashu Yadav]
        System.out.println(name[0]); //Saurabh Yadav


        System.out.println(num); //[I@372f7a8d
        System.out.println(Arrays.toString(num)); //[10, 20, 30, 40, 50]
        System.out.println(num[4]); //50

    }
}
