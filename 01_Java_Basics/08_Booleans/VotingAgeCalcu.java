import java.util.*;  // import the Scanner class

public class VotingAgeCalcu {
    public static void main(String[] args){
    int myAge=25;
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your age:");
    myAge = scanner.nextInt();  // Read user input
    scanner.close();
    int votingAge = 18;
    
    if (myAge >= votingAge) {
      System.out.println(myAge +" Years Old enough for vote!");
    } else {
      System.out.println(myAge+" Years old Not enough for vote.");
    }
    
}
}