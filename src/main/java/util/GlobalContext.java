package util;

import chain.ChainRunner;

/**
 * Global context - global entry point to our processing. Singleton
 */
public class GlobalContext {

    private final ChainRunner chainRunner = new ChainRunner();
    private final LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
    private final RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();

    public RemoveAdjacentDuplicates getRemoveAdjacentDuplicates() {
        return removeAdjacentDuplicates;
    }

    public ChainRunner getChainRunner() {
        return chainRunner;
    }

    public LevenshteinDistance getLevenshteinDistance() {
        return levenshteinDistance;
    }

    private static GlobalContext INSTANCE;

    private GlobalContext() {
    }

    @Override
    protected Object clone() {
        return this;
    }

    public static GlobalContext getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GlobalContext();
        }

        return INSTANCE;
    }
}
