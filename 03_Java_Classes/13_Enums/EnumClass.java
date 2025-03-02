
/*
 * 
 * An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

    To create an enum, use the enum keyword (instead of class or interface), 
    and separate the constants with a comma. Note that they should be in uppercase letters:
 * 
 */

public class EnumClass {
    public static void main(String[] args) {

        Direction direction = Direction.SOUTH;
        System.out.println(direction);
    }
}

enum Direction {
    EAST, WEST, NORTH, SOUTH
}


//Enum is short for "enumerations", which means "specifically listed".

//Output: SOUTH