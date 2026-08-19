import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberAnalyzerTest {

    @Test
    void testPositiveNumbers() {
        int[] numbers = {1, 2, 3};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(6, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] numbers = {-1, -2, -3};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(6, result);
    }
}
