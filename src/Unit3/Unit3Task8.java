package Unit3;//8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
//Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого
//массива с i-ым индексом к элементу из второго массива с i-ым индексом.
//Вывести все три массива на экран (каждый на отдельной строке),
//затем вывести количество целых элементов в третьем массиве.

import java.util.Arrays;
import java.util.Random;

    public class Unit3Task8 {
        public static void main(String[] args) {
            double[] array1 = new double[10];
            double[] array2 = new double[10];
            double[] array3 = new double[10];
            Random rd = new Random();
            int counter = 0;

            for (int i = 0; i < array1.length; i++) {
                array1[i] = rd.nextInt(9);
                array2[i] = rd.nextInt(9);
                array3[i] = array1[i] / array2[i];
                if(array3[i] % 1 == 0){
                    counter++;
                }
            }
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(array3));
            System.out.println("В третьем массиве " + counter + " цел. эл.");

        }
}
