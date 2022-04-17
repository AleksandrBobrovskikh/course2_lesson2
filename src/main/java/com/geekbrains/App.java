package com.geekbrains;

public class App {
    public static void main(String[] args) {
        String[][] a = {{"1", "2", "3", "4"},
                {"098", "2", "3", "4"},
                {"1", "2", "2", "4"},
                {"1", "2", "3", "4"}};

        appMethode(a);
    }

    public static void appMethode(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)
            throw new MyArraySizeException(array);
        int sum = 0;
        int i1 = 0, j1 = 0;
        try {
            for (int i = 0; i < array.length; i++, i1 = i) {
                for (int j = 0; j < array[i].length; j++, j1 = j) {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i1, j1);
        }
    }
}


