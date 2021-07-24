package Unit3;//5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
//каждого массива и сообщите, для какого из массивов это значение оказалось больше
//(либо сообщите, что их средние арифметические равны).

import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rd = new Random();
        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < array1.length; i++) {//заполняем, считаем СА1 СА2
            array1[i] = rd.nextInt(15);
            array2[i] = rd.nextInt(15);
            average1 += array1[i];
            average2 += array2[i];
            if(i == array1.length -1){
                average1 /= i + 1;
                average2 /= i + 1;
            }
        }
        System.out.print("массив1 : ");
        for (int i = 0; i < array1.length; i++) {//выводим1
            System.out.print(array1[i] + " ");
        }

        System.out.printf("\nмассив2 : ");
        for (int i = 0; i < array2.length; i++) {//выводим2
            System.out.print(array2[i] + " ");
        }

        if(average1 > average2){
            System.out.println("\nДля массива1 СА = " + average1 + " больше чем " + "СА для массива2  = " + average2);
        }else if(average1 < average2){
            System.out.println("\nДля массива1 СА = " + average1 + " меньше чем " + "СА для массива2 = " + average2);
        }else{
            System.out.println("\nДля массива1 СА = " + average2 + " равно " + "СА массива2 = " + average2);
        }
    }
}
