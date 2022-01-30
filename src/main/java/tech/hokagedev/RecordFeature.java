package tech.hokagedev;

/**
 * @author sareaboudousamadou.
 */
public class RecordFeature {
    public static void main(String[] args) {
       var cat = new Cat("Minou", 12);
        System.out.println(cat.sayHello());
    }
}

record Cat(String name, int age) implements Animal{

    Cat {
        System.out.println("Compact constructor");
    }

    public String sayHello() {
        return "Miaoum, Miamoum";
    }
}

interface Animal {}