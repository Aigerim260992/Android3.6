package com.example.android36.domain;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            int exception = 565656;
            return exception;
        } else {
            int result = a / b;
            return result;
        }
    }
}
