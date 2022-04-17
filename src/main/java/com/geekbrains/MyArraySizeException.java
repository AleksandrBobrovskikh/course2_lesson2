package com.geekbrains;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String[][] array) {
        super("Ошибка! Размер массива не соответствует условиям задачи!!!");
    }
}



