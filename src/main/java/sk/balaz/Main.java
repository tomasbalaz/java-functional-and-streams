package sk.balaz;

public class Main {
    public static void main(String[] args) {

        // OOP style
        EmailSender emailSender = new Hotmail();
        emailSender.send();

        // Anonymous class style
        EmailSender sender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Sending email using anonymous server ...");
            }
        };
        sender.send();


        // Lambda style
        EmailSender anonymous = () -> System.out.println("Sending email using anonymous server ...");
        anonymous.send();

        EmailSender gmail = () -> System.out.println("Sending email using gmail ...");
        EmailSender hotmail = () -> System.out.println("Sending email using hotmail ...");

        gmail.send();
        hotmail.send();

    }
}