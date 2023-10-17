package Homework_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {
    private NumberChecker numberChecker;

    @BeforeEach
    void setUp() {
        numberChecker = new NumberChecker();
    }
    @ParameterizedTest
    @CsvSource({"2, true",
                "1, false",
                "8, true",
                "3, false"})

    public void evenOddNumberTest(int n, boolean expectedResult) {
        boolean result = numberChecker.evenOddNumber(n);
        assertEquals(expectedResult, result);
    }
}
