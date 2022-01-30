package tech.hokagedev;

/**
 * @author sareaboudousamadou.
 */
public class SwitchFeature {
    public static void main(String[] args) {
        System.out.println(testSwitch(null));
    }

    private static int testSwitch(Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            case null -> -1;
        };
    }

}



enum Day {
    MONDAY, FRIDAY, SUNDAY, TUESDAY, THURSDAY, SATURDAY, WEDNESDAY
}
