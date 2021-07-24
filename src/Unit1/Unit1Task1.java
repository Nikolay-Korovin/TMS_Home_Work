package Unit1;//В переменную записываем число. Надо вывести на экран сколько в этом
//числе цифр и положительное оно или отрицательное. Например, "это
//однозначное положительное число". Достаточно будет определить, является ли
//число однозначным, двухзначным или трехзначным и более.

public class Unit1Task1 {
    public static void main(String[] args) {

        int number = 101;

        if (number / 10 == 0) {
            System.out.print(number + " Это число однозначное.");
        } else if (number / 10 >= 1 && number / 10 <= 9) {
            System.out.print(number + " Это число двухзначное.");
        } else {
            System.out.print(number + " Это число трёхзначное или более.");
        }

        if(number > 0){
            System.out.print(" Положительное");
        }else if(number == 0){
            System.out.print(" Нулевое");
        }else
            System.out.print(" Отрицательное");
    }
}
