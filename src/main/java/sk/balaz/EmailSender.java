package sk.balaz;

@FunctionalInterface
public interface EmailSender {
    void send();

    // Multiple non-overriding abstract methods found in interface sk.balaz.EmailSender
    // void unsend();

    String bar = "FOO";
    default void foo() {

    }
}
