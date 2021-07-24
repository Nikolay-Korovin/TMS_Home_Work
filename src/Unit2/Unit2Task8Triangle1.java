package Unit2;//дорисовать треугольники

public class Unit2Task8Triangle1 {
    public static void main(String[] args) {
        int row = 9;

        for(int i = 1; i <= row ; i++){

            for(int space = row; space > i; space--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}