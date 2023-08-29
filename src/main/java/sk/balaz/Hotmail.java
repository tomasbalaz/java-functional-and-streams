package sk.balaz;

public class Hotmail implements EmailSender {
    @Override
    public boolean send(String from, String to) {
        System.out.println("Sending email using hotmail ...");
        return false;
    }
}
