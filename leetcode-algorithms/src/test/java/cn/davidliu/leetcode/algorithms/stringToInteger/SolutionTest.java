package cn.davidliu.leetcode.algorithms.stringToInteger;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testMyAtoi() {
        Assert.assertEquals(42, solution.myAtoi("    42"));
        Assert.assertEquals(-42, solution.myAtoi("    -42"));
        Assert.assertEquals(4193, solution.myAtoi("4193 with words"));
        Assert.assertEquals(0, solution.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
        Assert.assertEquals(0, solution.myAtoi(" "));
        Assert.assertEquals(1, solution.myAtoi("+1"));
        Assert.assertEquals(Integer.MAX_VALUE, solution.myAtoi("1000000000000000000"));
        Assert.assertEquals(Integer.MIN_VALUE, solution.myAtoi("-1000000000000000000"));
        Assert.assertEquals(0, solution.myAtoi(null));
        Assert.assertEquals(Integer.MAX_VALUE, solution.myAtoi("2147483648"));
        Assert.assertEquals(2147483646, solution.myAtoi("2147483646"));
    }
}