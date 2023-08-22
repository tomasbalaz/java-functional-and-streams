package sk.balaz;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new Hotmail();
        emailSender.send();
    }
}