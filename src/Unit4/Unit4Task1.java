package Unit4;
//1) Посчитать сумму четных элементов стоящих на главной диагонали.

import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] array;
        System.out.println("Введите размерность матрицы");
        while (true) {
            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                if (size > 0) {
                    array = new int[size][size];
                    break;
                }
            } else {
                sc.next();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] % 2 == 0) {
                sum += array[i][i];
            }
        }
        System.out.println("Сумма четных элементов стоящих на главной диагонали = " + sum);

    }
}
