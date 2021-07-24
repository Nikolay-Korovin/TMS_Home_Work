package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    String ram;
    String ssd;
    int onOffResource;
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    Computer(int onOffResource){
        this.onOffResource = onOffResource ;
    }
    Computer(String processor, String ram, String ssd,int onOffResource) {
        this(onOffResource);
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }

    void display() {
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Накопитель: " + ssd);
        System.out.println("Количество возможных вкл/выкл = " + onOffResource);
        System.out.println();
    }

    void on() {
        if (onOffResource != 0) {
            System.out.println("Включаем " + this.processor + " компьютер");
            int random = rd.nextInt(2);
            System.out.println("Для включения угадайте 1 или 0?");
            int guess;
            while (true) {
                if (sc.hasNextInt()) {
                    guess = sc.nextInt();
                    if (guess >= 0 && guess <= 1) {
                        break;
                    }
                } else {
                    sc.next();
                }
            }
            if (random == guess) {
                System.out.println("Компьютер включен");
                onOffResource--;
                System.out.println("Количество возможных вкл/выкл = " + onOffResource);
            } else {
                System.out.println("Компу конец");
            }
        } else {
            System.out.println("У " + this.processor + "Лимит вкл/выкл исчерпан");
        }
    }

    void off() {
        if (onOffResource != 0) {
            System.out.println("Выключаем " + this.processor + " компьютер");
            int random = rd.nextInt(2);
            System.out.println("Для выключения угадайте 1 или 0?");
            int guess;
            while (true) {
                if (sc.hasNextInt()) {
                    guess = sc.nextInt();
                    if (guess >= 0 && guess <= 1) {
                        break;
                    }
                } else {
                    sc.next();
                }
            }
            if (random == guess) {
                System.out.println("Компьютер выключен");
                onOffResource--;
                System.out.println("Количество возможных вкл/выкл = " + onOffResource);
            } else {
                System.out.println("Компу конец");
            }
        } else {
            System.out.println("У " + this.processor + "Лимит вкл/выкл исчерпан");
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer("AMD Ryzen 100500", "Samsung Evo 8gb", "Seagate 1TB", 5);
        Computer computer1 = new Computer("Intel", "Kingston 16gb", "Xiaomi 1TB", 10);
        computer.display();
        computer1.display();
        computer.on();
        computer1.on();
        computer.off();
        computer1.off();
    }
}


