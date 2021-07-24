package Unit3;//10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
//Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n;
        int evenCounter = 0;
        int counter = 0;
        int[] array1;
        int[] array2;

        while (true){
            System.out.println("Введите число больше чем 3");
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n > 3){
                   array1 = new int[n];
                   break;
                }
            }else{
                sc.next();
            }
        }

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rd.nextInt(n);
            if(array1[i] % 2 == 0 && array1[i] != 0){
                evenCounter++;
            }
        }

        System.out.println(Arrays.toString(array1));
        array2 = new int[evenCounter];

        for (int i = 0; i < array1.length; i++) {
            if(array1[i] % 2 == 0 && array1[i] != 0){
                array2[counter] = array1[i];
                counter++;
            }
            if(counter == evenCounter){
                break;
            }
        }

        System.out.println(Arrays.toString(array2));
    }
}
