package com.itProger;

public class Main {

    public static void mass(int min) {

    }

    public static void main(String[] args) {
        int sumNumers = 0; // создаем переменную в которой будем суммировать числа кратные 3 или 5
        for (int i = 0; i <= 1000; i++) { // создаем цикл в котором пробегаемся по числам от 0 до 1000 включительно
            if (i > 0 && i % 3 == 0 || i % 5 == 0) { // в цикле пишем условие, что sum не должно быть равно 0 и должно быть кратно 3 или кратно 5
                sumNumers += i;  // если условия верны, то переменной sumNum прибавляем значение переменной sum
            }
        }
        System.out.println(sumNumers + " - Сумма чисел от 0 до 1000 кратных 3 или 5"); // затем выводим значение переменной в консоль


        // Поиск минимального значения в двумерном массиве
        int[][] x = {{20, 34, 2}, {9, 12, 13}, {3, 4, 5}};
        int min = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] < min) {
                    min = x[i][j];
                }
                }
            }
        System.out.println(min + " - Минимальное значение двумерного массива");
        }
    }
