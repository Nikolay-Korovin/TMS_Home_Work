package Unit2;//3)Вычислить:  1+2+4+8+…+256

public class Unit2Task3 {
    public static void main(String[] args) {
        int iterator = 1;
        int x = 0;

        while(iterator < 257){
            x += iterator;
            System.out.println("x + " + iterator + " = " + x);
            iterator *= 2 ;

        }

        System.out.println("x = " + x);
    }
}