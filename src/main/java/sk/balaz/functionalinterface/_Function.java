package sk.balaz.functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        Function<Integer, Integer> combinedFunction = incrementFunc.andThen(doubleFunc);
        System.out.println(combinedFunction.apply(1));
        System.out.println(combinedFunction.apply(3));
    }

    static Function<Integer, Integer> incrementFunc =
            n -> n + 1;

    static Function<Integer, Integer> doubleFunc =
            n -> n * 2;
    static int increment(int number) {
        return number + 1;
    }
}
