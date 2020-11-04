package com.SebastiaanLammertink;

public class Main {

    public static void main(String[] args) {
	    double varOne = 20.00d;
	    double varTwo = 80.00d;
	    double varThree = (varOne + varTwo) * 100.00d;
	    double remainder = varThree % 40.00d;
	    boolean noRemainder = (remainder == 0) ? true : false;
        System.out.println(noRemainder);
        if (!noRemainder) {
            System.out.println("Got some remainder");
            }
        }

    }

