import java.util.HashMap;
public class Loop {
    public static void main(String[] args){

        HashMap<String, String> capitalState = new HashMap<String, String>();
        capitalState.put("Uttar Pradesh", "Lucknow");
        capitalState.put("Maharashtra", "Mumbai");
        capitalState.put("Bihar", "Patna");
        capitalState.put("West Bengal", "Kolkata");
        capitalState.put("Madhya Pradesh", "Bhopal");
        capitalState.put("Tamil Nadu", "Chennai");
        capitalState.put("Rajasthan", "Jaipur");
        capitalState.put("Karnataka", "Bengaluru");
        capitalState.put("Gujarat", "Gandhinagar");
        capitalState.put("Andhra Pradesh", "Amaravati");
        capitalState.put("Odisha", "Bhubaneswar");
        capitalState.put("Telangana", "Hyderabad");
        capitalState.put("Kerala", "Thiruvananthapuram");
        capitalState.put("Jharkhand", "Ranchi");
        capitalState.put("Assam", "Dispur");
        capitalState.put("Punjab", "Chandigarh");
        capitalState.put("Chhattisgar", "Raipur");
        capitalState.put("Haryana", "Chandigarh");

        //print keys
        for(String i : capitalState.keySet()){
            System.out.println(i);
        }

    }
    
}
