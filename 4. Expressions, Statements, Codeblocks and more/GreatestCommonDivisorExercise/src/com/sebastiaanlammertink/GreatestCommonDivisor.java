package com.sebastiaanlammertink;

import com.sun.source.tree.BreakTree;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        if (first == 0)
            return second;
        while (second != 0) {
            if (first > second)
                first = first - second;
            else
                second = second - first;
        }
        return first;
    }
}


