package com.geekbrains;

public class MyArrayDataException extends RuntimeException {
    int a;
    int b;

    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;

    }
}
