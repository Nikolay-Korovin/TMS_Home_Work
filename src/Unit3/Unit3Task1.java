package Unit3;//1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
//сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик
//(отделяя один элемент от другого началом новой строки).
//Перед созданием массива подумайте, какого он будет размера.

public class Unit3Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int step = 2;

        for(int i = 0; i < 10; i++){
            array[i] = step;
            step += 2;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
