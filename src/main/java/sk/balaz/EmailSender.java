package sk.balaz;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);

    // Multiple non-overriding abstract methods found in interface sk.balaz.EmailSender
    // void unsend();

    String bar = "FOO";
    default void foo() {

    }
}
