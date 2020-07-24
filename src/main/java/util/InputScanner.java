package util;

import java.util.Scanner;

public class InputScanner extends Thread {
    /**
     * Input / new lines scanner. The entry CLI point of processing
     */
    @Override
    public void run() {
        Scanner inboundInput = new Scanner(System.in);
        while (inboundInput.hasNext()) {
            String line = inboundInput.nextLine();
            if (!line.equals("quit")) {
                GlobalContext.getInstance().getChainRunner().run(line);
            } else {
                break;
            }
        }

        try {
            inboundInput.close();
        } catch (Exception ignored) {
        }
        System.out.println("Application has been finished successfully");
        Thread.currentThread().interrupt();
    }
}
