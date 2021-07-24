package Unit3;//0)Ввести размерность массива с клавиатуры.
//Создать массив этого размера и заполнить случайными значениям.
//Вывести на экран все элементы в строчку через пробел.

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        int arraySize;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Введите размерность массива: ");
        arraySize = sc.nextInt();
        Integer[] array = new Integer[arraySize];

        for(int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }
}
