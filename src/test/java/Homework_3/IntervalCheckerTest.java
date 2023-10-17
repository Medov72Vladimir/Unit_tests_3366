package Homework_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
public class IntervalCheckerTest {
    private IntervalChecker checker;

    @BeforeEach
    void setUp() {
        checker = new IntervalChecker();
    }
    @ParameterizedTest
    @CsvSource({"24, false",
            "25, true",
            "100, true",
            "101, false"})

    public void numberInIntervalTest(int n, boolean expectedResult) {
        boolean result = checker.numberInInterval(n);
        assertEquals(expectedResult, result);
    }
}
