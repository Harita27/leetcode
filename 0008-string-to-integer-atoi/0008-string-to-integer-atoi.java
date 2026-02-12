import java.util.*;
import java.io.*;

class Solution {

    public int digit(String s, int i, long num, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            num = num * sign;

            if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return (int) num;
        }

        num = num * 10 + (s.charAt(i) - '0');

        if (sign == 1 && num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (sign == -1 && -num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return digit(s, i + 1, num, sign);
    }

    public int myAtoi(String s) {

        int i = 0;

        // Skip spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Default sign should be 1
        int sign = 1;

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        return digit(s, i, 0, sign);
    }
}