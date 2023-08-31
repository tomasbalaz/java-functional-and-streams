package sk.balaz.beyoundfunction;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {
        hello("Alex",
                null,
                input -> System.out.println(input + " you must have last name"));
    }

    static Consumer<String> cb = input ->
            System.out.println(input + " you must have last name");

    static void hello(String firstName,
                      String lastName,
                      Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }
        else {
            callback.accept(firstName);
        }
    }
}
