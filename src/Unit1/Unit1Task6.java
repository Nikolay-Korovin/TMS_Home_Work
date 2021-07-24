package Unit1;//Даны 2 числа. Вывести большее из них.

public class Unit1Task6 {
    public static void main(String[] args) {
        int x = 7;
        int y = 6;

        if(x > y){
            System.out.println(x);
        }else if(x < y){
            System.out.println(y);
        }else
            System.out.println("числа равны");
    }
}
