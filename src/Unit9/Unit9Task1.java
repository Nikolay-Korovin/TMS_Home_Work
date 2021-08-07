package Unit9;

//1)Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).

public class Unit9Task1 {
    public static void main(String[] args) {
        String str = "вырезаем подстроку из строки";
        str = cut(str, 'м', 'у');
        System.out.println(str);
    }

    public static String cut(String str, char symbolOne, char symbolTwo) {
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.toString());
        int index1 = str.indexOf(symbolOne);
        int index2 = str.lastIndexOf(symbolTwo);
        return String.valueOf(stringBuffer.delete(index1, index2 + 1));
    }
}
