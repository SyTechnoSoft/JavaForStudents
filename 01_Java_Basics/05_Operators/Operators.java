
public class Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result

        System.out.println(x + y); // Outputs 8
        System.out.println(x - y); // Outputs 2
        System.out.println(x * y); // Outputs 15
        System.out.println(x / y); // Outputs 1
        System.out.println(x % y); // Outputs 2
        System.out.println(x++); // Outputs 5
        System.out.println(x--); // Outputs 6
        System.out.println(x); // Outputs 5 
        System.out.println(++x); // Outputs 6   
        System.out.println(--x); // Outputs 5
        System.out.println(x); // Outputs 5
        System.out.println(x += 3); // Outputs 8
        System.out.println(x -= 3); // Outputs 5
        System.out.println(x *= 3); // Outputs 15
        System.out.println(x /= 3); // Outputs 5
        System.out.println(x %= 3); // Outputs 2
        System.out.println(x &= 3); // Outputs 2
        System.out.println(x |= 3); // Outputs 3
        System.out.println(x ^= 3); // Outputs 0
        System.out.println(x >>= 3); // Outputs 0
        System.out.println(x <<= 3); // Outputs 0
        System.out.println(x >>>= 3); // Outputs 0
        System.out.println(x <<= 3); // Outputs 0

            }
    
}
