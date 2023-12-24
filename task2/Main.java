package task2;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * User має властивості: ім'я, телефон.
 * Використовуючи можливості
 * java.util.function.Supplier,
 * створіть об'єкт User та виведіть дані про нього
 * в консоль.
 * Виведення має бути:
 * User name is Tom, phone 555 123-8596
 */
public class Main {

    public static void main(String[] args) {
        Supplier<User> userSupplier = () -> new User("Tom", "555 123-8596");
        Consumer<User> userConsumer = (user) -> System.out.println("User name is " + user.getName() + ", phone " + user.getPhone());
        userConsumer.accept(userSupplier.get());
    }
}
