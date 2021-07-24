package Unit1;//Даны 3 целых числа. Найти количество положительных чисел в исходном
//наборе.

public class Unit1Task4 {
    public static void main(String[] args) {
        int x = -9;
        int y = 10;
        int z = -1;

        int counter = 0;

        if(x > 0){
            counter++;
        }
        if(y > 0){
            counter++;
        }
        if(z > 0){
            counter++;
        }

        System.out.println("положительных чисел " + counter);
    }
}
