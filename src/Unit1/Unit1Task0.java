package Unit1;//Даны 2 числа. Первое - ваш месяц рождения, второе - день.
//Вывести все возможные действия над числами используя операторы JAVA(Арифмитические, Битовые, Логические и Сравнения)


public class Unit1Task0 {
    public static void main(String[] args) {
        int month = 10;
        int day = 3;

        System.out.println("Арифметеческие операторы");

        System.out.println("month = " + month + " day = " + day);
        System.out.println("month + day = " + (month + day));
        System.out.println("month - day = " + (month - day));
        System.out.println("month * day = " + (month * day));
        System.out.println("month / day = " + (month / day));
        System.out.println("month % day = " + (month % day));

        System.out.println("month += day = " + (month += day));
        System.out.println("month -= day = " + (month -= day));
        System.out.println("month *= day = " + (month *= day));
        System.out.println("month /= day = " + (month /= day));


        System.out.println("++month  ++day = " + ++month + "  " + ++day);
        System.out.println("--month  --day = " + --month + "  " + --day);
        System.out.println();

        System.out.println("Операторы сравнения");

        System.out.println("month > day = " + (month > day));
        System.out.println("month < day = " + (month < day));
        System.out.println("month == day = " + (month == day));
        System.out.println("month >= day = " + (month >= day));
        System.out.println("month <= day = " + (month <= day));
        System.out.println("month != day = " + (month != day));
        System.out.println();

        System.out.println("Логические операторы");

        if(month > 9 || day > 4){
            System.out.println("month > 9 || day > 4  = " + true);
        }
        if(month == 10 && day == 3){
            System.out.println("month == 10 && day == 3  = " + true);
        }
        if(month != day){
            System.out.println("month != day  = " + true);
        }
    }
}
