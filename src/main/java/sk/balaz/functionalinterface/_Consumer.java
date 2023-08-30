package sk.balaz.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        sendEmail("hello@hello.com");
        sendEmailConsumer.accept("hello@hello.com");

        List<String> emails = List.of(
                "hello@hello.com",
                "foo@hello.com",
                "bar@hello.com"
        );

        emails.forEach(sendEmailConsumer);
    }

    static void sendEmail(String email) {
        System.out.println("Sending email to " + email);
    }

    static Consumer<String> sendEmailConsumer =
            email -> System.out.println("Sending email to " + email);
}
