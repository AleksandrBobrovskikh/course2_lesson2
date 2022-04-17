package com.geekbrains;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int a, int b) {
        super("Ошибка преобразования в ячейке массива [" + a + "][" + b + "]");
    }
}
