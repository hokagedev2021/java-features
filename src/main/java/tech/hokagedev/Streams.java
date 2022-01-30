package tech.hokagedev;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author sareaboudousamadou.
 */
public class Streams {
    public static void main(String[] args) {
        var orangeColor = new FruitColor("Orange");
        var greenColor = new FruitColor("Green");
        var redColor = new FruitColor("Red");

        var orange = new Fruit(new FruitName("Orange"), orangeColor);
        var lemon = new Fruit(new FruitName("Lemon"), greenColor);
        var tomato = new Fruit(new FruitName("Tomate"), redColor);

        var fruits = Stream.of(orange, lemon, tomato).toList();

        System.out.println(fruits);
    }
}

record Fruit(FruitName name, FruitColor color) {

}

record FruitName(String value) {

    FruitName(String value) {
        if(value == null) {
            throw new IllegalArgumentException("Fruit name could not be null");
        }
        this.value = value;
    }
}

record FruitColor(String value) {

    FruitColor(String value) {
        if(value == null) {
            throw new IllegalArgumentException("Fruit color could not be null");
        }
        this.value = value;
    }
}
