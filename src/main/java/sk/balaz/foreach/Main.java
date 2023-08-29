package sk.balaz.foreach;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jamila", "Alex", "Mariam"};

        for(String name: names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        List<String> names2 = List.of("Jamila", "Alex", "Mariam");
        Consumer<String> stringConsumer = System.out::println;
        names2.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
