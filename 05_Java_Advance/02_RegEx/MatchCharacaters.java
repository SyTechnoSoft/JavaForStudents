import java.util.regex.*;
public class MatchCharacaters {
    
    public static void main(String  [] arg){
        System.out.println(Pattern.matches("[b-z]","a"));//false (a is not matching pattern)
        // Check if all the elements are in range a to z
        // or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]+",
                                           "GfgTestCase"));

        // Check if elements is not in range a to z
        System.out.println(Pattern.matches("[^a-z]?",
                                           "g"));

        // Check if all the elements are either g,e,k or s
        System.out.println(Pattern.matches("[geks]*",
                                     "geeksgeeks"));
    }


}
