package tech.hokagedev;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author sareaboudousamadou.
 */
public class CompactNumberFormatting {
    public static void main(String[] args) {
        // Short format
        var fmtShortFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(fmtShortFormat.format(1000));
        System.out.println(fmtShortFormat.format(100000));
        System.out.println(fmtShortFormat.format(1000000));

        //Long format
        var fmtLongFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(fmtLongFormat.format(1000));
        System.out.println(fmtLongFormat.format(100000));
        System.out.println(fmtLongFormat.format(1000000));
    }
}
