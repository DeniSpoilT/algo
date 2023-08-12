package ru.komarov.easy.leetcode.arrays.msa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("providesArraysAndIntsAndExpectedResult")
    public void mergeShould_MergesTwoArraysInOneOrderByASC_test(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected,nums1);
    }

    private static Stream<Arguments> providesArraysAndIntsAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0},
                        3,
                        new int[]{2, 5, 6},
                        3,
                        new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1},
                        1,
                        new int[]{},
                        0,
                        new int[]{1}),
                Arguments.of(new int[]{0},
                        0,
                        new int[]{1},
                        1,
                        new int[]{1})
        );
    }


}
