package sk.balaz.functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        Person jamila = personMapperBiFunc.apply("Jamila", 18);
        System.out.println(jamila);
    }

    record Person(
            String name,
            int age
    ) {}

    static BiFunction<String, Integer, Person> personMapperBiFunc =
          //  (name, age) -> new Person(name, age);
            Person::new;

    static Person personMapper(String name, int age) {
        return new Person(name, age);
    }

}
