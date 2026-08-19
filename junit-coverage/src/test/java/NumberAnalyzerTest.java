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
        @Test
    void testEmptyArray() {
        int[] numbers = {};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(0, result);
    }

    @Test
    void testSinglePositiveNumber() {
        int[] numbers = {5};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(5, result);
    }

    @Test
    void testSingleNegativeNumber() {
        int[] numbers = {-5};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(5, result);
    }

    @Test
    void testPositiveThenNegative() {
        int[] numbers = {5, -3};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(8, result);
    }

    @Test
    void testNegativeThenPositive() {
        int[] numbers = {-5, 3};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(8, result);
    }
}
