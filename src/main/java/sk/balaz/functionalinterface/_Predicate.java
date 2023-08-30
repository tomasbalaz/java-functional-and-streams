package sk.balaz.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        var email = "hello@hello.com";
        System.out.println(isEmailValid(email));

        System.out.println(isEmailValidPredicate.test("hello@hello.com"));
        System.out.println(isEmailValidPredicate.and(containsDotPredicate).test("to@hello.com"));

        List.of("to@hello.com")
                .stream()
                .filter(isEmailValidPredicate.and(containsDotPredicate))
                .toList();

    }

    static boolean isEmailValid(String email) {
        return email.contains("@");
    }

    static Predicate<String> isEmailValidPredicate =
            email -> email.contains("@");

    static Predicate<String> containsDotPredicate =
            email -> email.contains(".");
}
