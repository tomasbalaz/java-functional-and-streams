package sk.balaz.combinatornpattern;

import java.util.List;

import static sk.balaz.combinatornpattern.PersonRegistrationValidator.*;

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


        Person jamila = new Person(
                "Jamila",
                "070000",
                "jamila@gmail.com"
        );

        Person alex = new Person(
                "Alex",
                "080000",
                "alex@gmail.com"
        );

        PersonRegistrationValidator validator = isEmailTaken()
                .and(isEmailValid())
                .and(isPhoneNumberValid());

        System.out.println(validator.apply(jamila));
        System.out.println(validator.apply(alex));
    }
}
