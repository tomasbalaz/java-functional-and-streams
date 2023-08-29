package sk.balaz.functionalinterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class _Function {

    public static void main(String[] args) {
        System.out.println(increment(1));
        System.out.println(incrementFunc.apply(1));

        List<Integer> integers = Stream.of(1, 2, 3)
                .map(_Function::increment)
                .toList();

        System.out.println(integers);
    }

    static Function<Integer, Integer> incrementFunc =
            n -> n + 1;

    static int increment(int number) {
        return number + 1;
    }
}
