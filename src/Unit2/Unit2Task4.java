package Unit2;//4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.


public class Unit2Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int answer = 0;

        for(int i = 0;i < a; i ++){
            answer += b;
        }

        System.out.println(a + " * "+  b + " = " + answer);
    }
}