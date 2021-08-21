package Unit10.Unit10Task1HW;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("BMW", 150, 1500000);
        Car car1 = new Car("BMW1", 1500, 1500000);
        Car car2 = new Car("Mercedes",200,100000);

        carEngineStart(car);
        carEngineStart(car1);
        carEngineStart(car2);
    }

    private static void carEngineStart(Car car) {
        try {
            car.startEngine();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
