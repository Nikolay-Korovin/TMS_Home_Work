package Unit9;

//2)Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0

public class Uni9Task2 {
    public static void main(String[] args) {
        String str = "заменяем все вхождения символа стоящего в позиции (3), на символ в позиции (0)";
        str = str.replace(str.charAt(3), str.charAt(0));
        System.out.println(str);
    }
}
