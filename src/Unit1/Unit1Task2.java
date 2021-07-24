package Unit1;//Треугольник существует только тогда, когда сумма любых двух его сторон
//больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
//стороны предполагаемого треугольника. Требуется сравнить длину каждого
//отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
//окажется больше суммы двух других, то треугольника с такими сторонами не
//существует.

public class Unit1Task2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 11;

        System.out.println("Дан треугольник со сторонами a = " + a + " b = " + b + " c = " + c );

        if((a + b) < c){
            System.out.println("Треугольника с такими сторонами не существует");
        }else if((b + c) < a){
            System.out.println("Треугольника с такими сторонами не существует");
        }else if((a + c) < b){
            System.out.println("Треугольника с такими сторонами не существует");
        }else
            System.out.println("Треугольник с такими сторонами существует");
    }
}