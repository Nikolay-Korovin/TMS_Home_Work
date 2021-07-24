package Unit1;//Даны 3 целых числа. Найти количество положительных и отрицательных
//чисел в исходном наборе.

public class Unit1Task5 {
    public static void main(String[] args) {
        int x = -1;
        int y = 0;
        int z = 4;
        int negativeCount = 0;
        int positiveCount = 0;

        if(x > 0){
            positiveCount++;
        }else if(x != 0)
            negativeCount++;
        if(y > 0){
            positiveCount++;
        }else if(y != 0)
            negativeCount++;
        if(z > 0){
            positiveCount++;
        }else if(z != 0)
            negativeCount++;

        System.out.println("количество положительных чисел "+ positiveCount);
        System.out.println("количество отрицательных чисел "+ negativeCount);

    }
}
