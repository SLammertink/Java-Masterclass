package com.sebastiaanlammertink;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        // declare the first and second number variables
        int firstXNumber = x / 10;
        int secondXNumber = x % 10;
        int firstYNumber = y / 10;
        int secondYNumber = y % 10;

        if (firstXNumber == firstYNumber || secondXNumber == secondYNumber || firstXNumber == secondYNumber
                || secondXNumber == firstYNumber) {
            return true;
        }
        return false;
    }
}
