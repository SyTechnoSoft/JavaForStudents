public class LowestValue {
    public static void main(String[] args){
        int[] num = {50, 20, 15, 40, 50};
        int min = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Lowest value is: " + min);
    }
}
