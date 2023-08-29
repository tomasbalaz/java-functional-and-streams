package sk.balaz;

public class Main {
    public static void main(String[] args) {

        // OOP style
        EmailSender emailSender = new Hotmail();
        emailSender.send("from@gmail.com", "to@gmail.com");

        // Anonymous class style
        EmailSender sender = new EmailSender() {
            @Override
            public boolean send(String from, String to) {
                System.out.println("Sending email using anonymous server ...");
                return false;
            }
        };
        sender.send("from@gmail.com", "to@gmail.com");


        // Lambda style
        EmailSender anonymous = (from, to) -> {
            System.out.println("Sending email using anonymous server ...");
            return true;
        };
        anonymous.send("from@gmail.com", "to@gmail.com");

        EmailSender gmail = (from, to)  -> {
            System.out.println("Sending email using gmail server ...");
            return false;
        };

        EmailSender hotmail = (from, to)  -> {
            // logic
            // more logic
            var isValid = from.contains("@");
            System.out.println("Sending email using hotmail ...");
            return isValid;
        };

        gmail.send("from@gmail.com", "to@gmail.com");
        hotmail.send("from@gmail.com", "to@gmail.com");

    }
}