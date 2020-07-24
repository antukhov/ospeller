package chain;

import chain.processors.DuplicatesRemoverProcessingHandler;
import chain.processors.TrimmerProcessingHandler;

import java.util.ArrayList;
import java.util.List;

public class ChainRunner {

    private final List<ProcessingHandler> processingHandlers = new ArrayList<>();

    public ChainRunner() {
        processingHandlers.add(new TrimmerProcessingHandler());
        processingHandlers.add(new DuplicatesRemoverProcessingHandler());
    }

    public void run(String stringInput) {
        for (int i = 0; i < processingHandlers.size() - 1; i++) {
            processingHandlers.get(i).setNextProcessingHandler(processingHandlers.get(i + 1));
        }
        processingHandlers.get(0).process(stringInput);
    }

}
