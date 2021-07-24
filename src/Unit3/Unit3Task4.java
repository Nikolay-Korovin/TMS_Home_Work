package Unit3;//4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rd = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < array.length; i++){
            if(i % 2 != 0){
                array[i] = 0;
                System.out.print(array[i] + " ");
            }else{
                System.out.print(array[i] + " ");
            }
        }
    }
}
