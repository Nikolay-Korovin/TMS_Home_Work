package Unit3;//9)Пользователь должен указать с клавиатуры положительное число,
//а программа должна создать массив указанного размера из случайных целых чисел из [0;15]
//и вывести его на экран в строку. После этого программа должна определить и сообщить пользователю о том,
//сумма какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
//Если пользователь введёт неподходящее число, то выдать соответствующее сообщение

import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int[] array;
        int leftSide = 0;
        int rightSide = 0;

        while(true){
            System.out.println("Введите положительное чётное число");
            if(scanner.hasNextInt()){
                size = scanner.nextInt();
                if(size > 0 & size % 2 == 0) {
                    array = new int[size];
                    break;
                }
            }else{
                scanner.next();
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);

            if(i < (array.length)/2){
                leftSide += array[i];
            }else{
                rightSide += array[i];
            }

            System.out.print(array[i] + " ");
        }

        if(leftSide > rightSide){
            System.out.println("\nЛевая половина (" + leftSide + ")" + " больше правой (" + rightSide + ")");
        }else if(leftSide < rightSide){
            System.out.println("\nЛевая половина (" + leftSide + ")" + " меньше правой (" + rightSide + ")");
        }else{
            System.out.println("\nПоловины равны (" + leftSide + ")=(" + rightSide + ")");
        }
    }
}
