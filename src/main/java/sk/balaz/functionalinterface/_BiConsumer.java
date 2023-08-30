package sk.balaz.functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {

    public static void main(String[] args) {
        sendEmail("from@hello.com", "to@hello.com");
        sendEmailBiConsumer.accept("from@hello.com", "to@hello.com");
    }

    static BiConsumer<String, String> sendEmailBiConsumer =
            (from, to) -> System.out.printf("Sending email from %s to %s %n", from, to);

    static void sendEmail(String from, String to) {
        System.out.printf("Sending email from %s to %s %n", from, to);
    }
}
