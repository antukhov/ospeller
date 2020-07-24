package chain;

/**
 * Processing chain interface.
 * <p>
 * Possible improvement: replace process(String) with process(CustomObject) to keep the statistics
 */
public interface ProcessingHandler {

    void setNextProcessingHandler(ProcessingHandler requestHandler);

    boolean process(String inputString);

}
