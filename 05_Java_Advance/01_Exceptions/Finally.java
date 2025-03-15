public class Finally {
    public static void main(String[] args){
        try {
            int[] mynumber={1,2,3,4};
            System.out.println(mynumber[10]);

        } catch (java.lang.Exception e) {
            System.out.println("Something went wrong in the code " +e);
        }
        finally{
            System.out.println("The 'try catch' is finished.");
        }
    }
    
}
