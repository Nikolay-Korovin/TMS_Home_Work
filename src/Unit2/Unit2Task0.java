package Unit2;//0)Вывести на экран последовательность чисел от 0 до 10 три раза каждый раз используя  разные циклы.

public class Unit2Task0 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        while(counter != 11){
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();
        counter = 0;


        do {
            System.out.print(counter + " ");
            counter++;
        }while (counter != 11);

    }
}