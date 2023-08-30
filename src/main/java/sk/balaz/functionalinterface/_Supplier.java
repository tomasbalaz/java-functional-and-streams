package sk.balaz.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getUrl());
        System.out.println(getUrlSupplier.get());
        System.out.println(getUrlsSupplier.get());
    }

    static String getUrl() {
        return "https//:google.com";
    }

    static Supplier<String> getUrlSupplier =
            () -> "https//:google.com";

    static Supplier<List<String>> getUrlsSupplier =
            () -> {
                // logic
                return List.of("https//:google.com");
            };
}
