package com.sebastiaanlammertink;

public class numberToWords {
    public static int numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Number");
        }
        int firstNumber = 0;
        int lastNumber = number % 10;

        while (true){
            if (number / 10 > 0){
                number /= 10;
                continue;
            }
            firstNumber = number;
            System.out.println(firstNumber + lastNumber);

        }

    }

}
