import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import util.LevenshteinDistance;

public class LevenshteinDistanceTests {

    LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

    @Test
    void LevenshteinDistance() {

        boolean result = levenshteinDistance.calculate("development", "development") == 100;
        Assertions.assertTrue(result);
    }
}
