package tech.hokagedev;

import java.math.BigDecimal;

/**
 * @author sareaboudousamadou.
 */
public class NullPointerExceptionFeeature {
    public static void main(String[] args) {
        System.out.println(new Money(null, "EUR").print());
    }
}

record Money(BigDecimal value, String currency) {

    public String print() {
        return this.value.toString() + " " + this.currency;
    }
}
