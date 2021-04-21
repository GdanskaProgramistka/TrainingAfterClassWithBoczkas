package EnumExample;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        DayOfTheWeek today = DayOfTheWeek.SUNDAY;

        if (today.equals(DayOfTheWeek.SUNDAY)) {
            System.out.println("Today is Sunday");
        }

        else {
            System.out.println("Today is not Sunday");
        }
        // metoda valueOff:
        DayOfTheWeek secondDay = Enum.valueOf(DayOfTheWeek.class, "TUESDAY");
        System.out.println(secondDay);

        // metoda toString():
        System.out.println(DayOfTheWeek.MONDAY.toString());

        // metoda value(Class enumClass, String name):
        DayOfTheWeek[] values = DayOfTheWeek.values();
        System.out.println(Arrays.toString(values));

        // metoda odinal (zwracająca położenie):
        System.out.println(DayOfTheWeek.FRIDAY.ordinal());

        // metoda compareTo:
        System.out.println(DayOfTheWeek.MONDAY.compareTo(DayOfTheWeek.FRIDAY));
        System.out.println(DayOfTheWeek.FRIDAY.compareTo(DayOfTheWeek.MONDAY));


    }
}


