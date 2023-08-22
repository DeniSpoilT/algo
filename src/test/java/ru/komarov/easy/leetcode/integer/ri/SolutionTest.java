package ru.komarov.easy.leetcode.integer.ri;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({"123, 321", "-123, -321", "120, 21"})
    public void reverseShould_returnInvertedNumberPassed_test(int x, int expected) {
        Solution solution = new Solution();
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }
}
