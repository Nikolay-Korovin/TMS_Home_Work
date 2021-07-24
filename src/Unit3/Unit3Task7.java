package Unit3;//7)Создайте массив из 12 случайных целых чисел из отрезка [0;15].
// Определите какой элемент является в этом массиве
// максимальным и сообщите индекс его последнего вхождения в массив.

import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random rd = new Random();
        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(15);
            System.out.print(array[i] + " ");
            if(array[i] >= max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("\nМаксимальный элемент в массиве = " + max + ". Его последний индекс = " + index);
    }
}
