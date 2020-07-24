package chain.processors;

import chain.ProcessingHandler;

public class TrimmerProcessingHandler implements ProcessingHandler {

    private ProcessingHandler processingHandler;

    @Override
    public void setNextProcessingHandler(ProcessingHandler processingHandler) {
        this.processingHandler = processingHandler;
    }

    @Override
    public boolean process(String inputString) {
        inputString = inputString.replaceAll("\\W+", "");
        return processingHandler == null || processingHandler.process(inputString);
    }

}
