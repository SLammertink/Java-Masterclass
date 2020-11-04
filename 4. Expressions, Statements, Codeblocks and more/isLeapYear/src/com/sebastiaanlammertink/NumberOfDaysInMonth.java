package com.sebastiaanlammertink;

public class NumberOfDaysInMonth {


    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
            return false;

    }

    public static int getDaysInMonth(int month, int year) {
        int numDays = 0;
        if ((month < 1 || month > 12) || (year <= 1 || year >= 9999)) {
            return -1;
        } else if (isLeapYear(year) == true) {


            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    //return numDays;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    //return numDays;
                    break;
                case 2:
                    numDays = 29;
                    break;
                    //return numDays;
            }
            return numDays;


        } else {

        }
        switch (month) {
            case 2:
                numDays = 28;
                break;
        }
        return numDays;
    }
}


