package Unit2;//5)Напишите программу печати таблицы перевода расстояний из дюймов
//в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Unit2Task5 {
    public static void main(String[] args) {
        double inch = 2.54;

        for(int i = 1; i <= 20; i ++){
            System.out.println(i + " inch = " + i * inch + " sm");
        }
    }
}