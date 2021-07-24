package Unit1;//Дано целое число. Если оно является положительным, то прибавить к нему 1.
//Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//10. Вывести полученное число.

public class Unit1Task3 {
    public static void main(String[] args){
        int number = -4;

        if(number > 0){
            number++;
        }else if(number < 0){
            number -= 2;
        }else{
            number = 10;
        }

        System.out.println(number);
    }

}
