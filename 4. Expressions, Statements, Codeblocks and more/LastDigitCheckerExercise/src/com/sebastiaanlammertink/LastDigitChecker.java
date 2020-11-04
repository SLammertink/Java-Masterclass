package com.sebastiaanlammertink;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 0 || z > 1000)) {
            return false;
        }
        int lastX = x % 10;
        int lastY = y % 10;
        int lastZ = z % 10;

        if ((lastX == lastY) || (lastX == lastZ) || lastY == lastZ) {
            return true;
        }
        return false;
    }
    public static boolean isValid ( int number){
        if ( number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
