package Unit4;
//3)Проверить произведение элементов какой диагонали больше

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
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

        int multiply1 = 1;
        for (int i = 0; i < array.length; i++) {
            multiply1 = multiply1 * array[i][i];
        }

        int multiply2 = 1;
        for (int i = 0, j = array.length - 1; i <= array.length - 1; i++, j--) {
            multiply2 = multiply2 * array[i][j];
        }

        if (multiply1 > multiply2) {
            System.out.println("Произведение элементов главной диагонали больше " + multiply1 + " > " + multiply2);
        } else if (multiply1 < multiply2) {
            System.out.println("Произведение элементов побочной диагонали больше " + multiply1 + " < " + multiply2);
        } else {
            System.out.println("Произведения гланой и побочной диагоналей равны " + multiply1 + " = " + multiply2);
        }
    }
}