
public class EnumInClass {

    enum Direction {
        EAST,
        WEST,
        NORTH,
        SOUTH
    }


    public static void main(String[] args) {
        Direction direction =Direction.SOUTH;
        System.out.println("Result from Enum is -> "+direction);
    }
    
}

