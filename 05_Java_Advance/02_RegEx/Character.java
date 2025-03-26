import java.util.regex.*;

public class Character {

    public static void main(String[] args){
        System.out.println(Pattern.matches("[a-z]",
        "g")); // true (the given input is in the range of a-z)
        System.out.println(Pattern.matches("[a-zA-Z]", "Gfg")); // false (the input contains a special character)
    }
}
