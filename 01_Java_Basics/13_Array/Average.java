public class Average {
    public static void main(String[] args){
        int sum=0;

        int[] num = {10, 20, 30, 40, 50, 60};
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println("Average: " + sum/num.length);
    }
    
}
