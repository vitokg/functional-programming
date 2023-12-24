package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


/**
 * Використовуючи можливості
 * java.util.Arrays,
 * java.util.List,
 * java.util.function.Consumer,
 * сформуйте вхідні дані та виведіть їх в консоль.
 * Виведення має бути:
 * Name is Tom
 * Name is Alice
 * Name is Bob
 * Name is Lucy
 */
public class Main {

    public static List<String> names = new ArrayList<>();
    static Consumer<String> consumer = (name) -> System.out.println("Name is " + name);
    public static void main(String[] args) {
        names.add("Tom");
        names.add("Alice");
        names.add("Bob");
        names.add("Lucy");

        names.forEach((name) -> consumer.accept(name));
    }
}
