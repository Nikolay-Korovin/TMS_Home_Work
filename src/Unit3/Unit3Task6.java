package Unit3;//6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
//Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rd = new Random();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10);
            System.out.print(array[i] + " ");
            if(i >=1){
                if(array[i-1] < array[i]){
                    counter++;
                }
            }
        }

        if(counter == 3){
            System.out.println("Массив является строго возрастающей последовательностью");
        }else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью");
        }
    }
}
