package sk.balaz.combinatornpattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        List<String> emails = List.of(
                "to@hello.com",
                "to@hello.com",
                "to@hello.com"
        );

        emails.forEach(email -> {
            var isValid = emailValidator.apply(email);
            System.out.println("Email %s is valid: %s ".formatted(email, isValid));
        });
    }
}
