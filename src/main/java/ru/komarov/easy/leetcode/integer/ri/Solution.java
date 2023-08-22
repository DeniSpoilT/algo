package ru.komarov.easy.leetcode.integer.ri;

public class Solution {
    public int reverse(int x) {
        long revx = 0;

        while (x != 0) {
            int lastNum = x % 10;
            revx = revx * 10 + lastNum;
            x /= 10;
        }
        if (revx < Math.pow(-2, 31) || revx > Math.pow(2, 31))
            return 0;
        else
            return (int) revx;
    }

}
