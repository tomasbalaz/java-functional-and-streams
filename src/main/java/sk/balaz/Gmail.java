package sk.balaz;

public class Gmail implements EmailSender {
    @Override
    public boolean send(String from, String to) {
        System.out.println("Sending email using gmail ...");
        return false;
    }
}
