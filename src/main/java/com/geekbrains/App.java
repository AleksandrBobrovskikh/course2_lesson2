package com.geekbrains;

public class App {
    public static void main(String[] args) {
        String[][] a = {{"1", "2", "3", "4"},
                {"3", "2", "3", "1"},
                {"4", "1", "3", "4"},
                {"3", "2", "3", "4"}};
        try {
            appMethode(a);
        } catch (MyArrayDataException e) {
            System.out.println("Неправильный формат ячейки массива - [" + e.a + "][" + e.b + "]");
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива!");
        }
    }

    public static void appMethode(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0, i1 = 0, j1 = 0;

        for (int i = 0; i < 4; i++)
            if (array[i].length != 4 || array.length != 4)
                throw new MyArraySizeException(array);
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    j1 = j;
                    i1 = i;
                    sum += Integer.parseInt(array[i][j]);
                }
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i1, j1);
        }
    }
}



