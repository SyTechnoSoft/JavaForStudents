
enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Loop {
 
    public static void main(String[] args) {
        for (Month month : Month.values()){
            System.out.println("It's "+month);
        }
    }
    
}

