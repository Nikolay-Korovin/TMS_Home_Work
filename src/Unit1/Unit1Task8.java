package Unit1;//Ввести 2 числа с клавиатуры используя Scanner или BufferedReader. Вывести большее из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit1Task8 {
    public static void main(String[] args) throws IOException {
        int x;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        x = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        y = Integer.parseInt(reader.readLine());

        if(x > y){
            System.out.println(x);
        }else if(x < y){
            System.out.println(y);
        }else
            System.out.println("числа одинаковы");
    }
}
