import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.DayOfWeek;

public class SwitchExpressionTest {

    @ParameterizedTest
    @EnumSource(DayOfWeek.class)
    public void holidaySwitch(DayOfWeek day) {
        boolean isTodayHoliday;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                isTodayHoliday = false;
                break;
            case SATURDAY:
            case SUNDAY:
                isTodayHoliday = true;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        };

        System.out.println(day + (isTodayHoliday ? " is holiday" : " is not holiday"));
    }

    @ParameterizedTest
    @EnumSource(DayOfWeek.class)
    public void holidaySwitchExpression(DayOfWeek day) {
        boolean isTodayHoliday = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
        }; // No default needed for enums

        System.out.println(day + (isTodayHoliday ? " is holiday" : " is not holiday"));
    }

}
