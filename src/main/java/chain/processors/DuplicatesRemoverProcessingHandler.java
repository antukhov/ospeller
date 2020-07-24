package chain.processors;

import chain.ProcessingHandler;
import util.GlobalContext;

public class DuplicatesRemoverProcessingHandler implements ProcessingHandler {

    private ProcessingHandler processingHandler;

    @Override
    public void setNextProcessingHandler(ProcessingHandler processingHandler) {
        this.processingHandler = processingHandler;
    }

    @Override
    public boolean process(String inputString) {
        String removeDuplicates = GlobalContext.getInstance().getRemoveAdjacentDuplicates().remove(inputString);
        System.out.println("> " + removeDuplicates);
        return processingHandler == null || processingHandler.process(removeDuplicates);
    }
}
