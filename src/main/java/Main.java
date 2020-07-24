import util.InputScanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Oracle English Word Spell Auto Correction");
        System.out.println("Type your first word and press Return button...");
        new Thread(new InputScanner()).start();
    }
}
