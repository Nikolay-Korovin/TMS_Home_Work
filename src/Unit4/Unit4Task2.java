package Unit4;
//2)Вывести нечетные элементы находящиеся под главной диагональю.

import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
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

        System.out.println("Нечетные элементы находящиеся под главной диагональю");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i][j] % 2 != 0){
                    System.out.print(array[i][j] + " ");
                }
            }
        }


    }
}
