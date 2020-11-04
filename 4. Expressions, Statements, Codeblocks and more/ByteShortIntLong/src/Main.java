public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value: " + myMinIntValue);
        System.out.println("Integer max value: " + myMaxIntValue);
        System.out.println("My busted max value: " + (myMaxIntValue + 1));
        System.out.println("My busted min value: " + (myMinIntValue - 1));

        System.out.println("--------------------------------------");

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My min byte value: " + myMinByteValue);
        System.out.println("My max byte value: " + myMaxByteValue);

        System.out.println("--------------------------------------");

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My min short value: " + myMinshortValue);
        System.out.println("My max short value: " + myMaxShortValue);

        System.out.println("--------------------------------------");

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("My min long value: " + myMinlongValue);
        System.out.println("My max long value: " + myMaxlongValue);

        System.out.println("--------------------------------------");
        System.out.println("Primitive types Challenge:  ");
        System.out.println("--------------------------------------");

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLong = 50000L + ( 10 * ( myByte + myShort + myInt));
        System.out.println(myLong);

        System.out.println("--------------------------------------");

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("My min float value is: " + myMinFloat);
        System.out.println("My max float value is: " + myMaxFloat);

        System.out.println("--------------------------------------");
        System.out.println("Casting challenge");
        System.out.println("--------------------------------------");

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("My int value is: " + myIntValue);
        System.out.println("My float value is: " + myFloatValue);
        System.out.println("My double value is: " + myDoubleValue);

        System.out.println("--------------------------------------");
        System.out.println("Floating point challenge");
        System.out.println("--------------------------------------");

        double pounds = 200d;
        double kilograms = pounds * 0.45359327;
        System.out.println(pounds + " " + "pounds converted to kilograms = " + kilograms + " " + "kilograms");

<<<<<<< HEAD
=======
        System.out.println("--------------------------------------");
        System.out.println("Logical OR operator");
        System.out.println("--------------------------------------");

        int topScore = 80;
        int secondTopScore = 81;

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if ( newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }

        System.out.println("--------------------------------------");
        System.out.println("Ternary operator");
        System.out.println("--------------------------------------");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        System.out.println("--------------------------------------");
        System.out.println("Operator precedence");
        System.out.println("--------------------------------------");

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double result = ( firstNumber + secondNumber) * 100.00d;
        double remainder = result % 40.00d;
        System.out.println("Remainder is : " + remainder);
        boolean remainderResult = (remainder == 0) ? true : false;
        System.out.println("remainderResult is " + remainderResult);
        if (!remainderResult){
            System.out.println("There is a remainder");
        }








>>>>>>> 09e93559fea7de82c3dae6204cb76ce77de46ee7












    }
}
