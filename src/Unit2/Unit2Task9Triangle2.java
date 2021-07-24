package Unit2;//дорисовать треугольники

public class Unit2Task9Triangle2 {
    public static void main(String[] args) {
        int row = 9;

        for(int i = 1; i <= row ; i++){

            for(int space = 0; space < i; space++){
                System.out.print(" ");
            }
            for(int j = row; j >= i; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}