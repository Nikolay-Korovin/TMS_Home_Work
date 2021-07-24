package Unit3;//3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
//Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//это количество на экран на отдельной строке.


import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random rd = new Random();
        int evenCounter = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(99);
            System.out.print(array[i] + " ");
            if(array[i] != 0 && array[i] % 2 == 0){
                evenCounter++;
            }
        }

        System.out.printf("\nКоличество чётных элементов = " + evenCounter);
    }
}
