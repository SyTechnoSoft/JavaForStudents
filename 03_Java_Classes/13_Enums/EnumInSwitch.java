
enum Day {
    SUNDAY, 
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY
}


public class EnumInSwitch {

    public static void main(String[] args) {
        Day day = Day.SUNDAY;

      

        switch(day){
            case SUNDAY -> System.out.println("It's Sunday");
            case MONDAY -> System.out.println("It's Monday");
            case TUESDAY -> System.out.println("It's Tuesday");
            case WEDNESDAY -> System.out.println("It's Wednesday");
            case THURSDAY -> System.out.println("It's Thursday");
            case FRIDAY -> System.out.println("It's Friday");
            case SATURDAY -> System.out.println("It's Saturday");
          
        }



    }

}
