package EnumExample;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek today = DayOfTheWeek.SUNDAY;

        if (today.equals(DayOfTheWeek.SUNDAY)) {
            System.out.println("Today is Sunday");
        }

        else {
            System.out.println("Today is not Sunday");
        }
    }
}
