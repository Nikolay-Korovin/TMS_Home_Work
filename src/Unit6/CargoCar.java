package Unit6;

public class CargoCar extends GroundTransport {
    int loadCapacity;

    public CargoCar(double horsePower, int maxSpeed, double mass, Brand brand, int numberOfWheels, double fuelRate, int loadCapacity) {
        super(horsePower, maxSpeed, mass, brand, numberOfWheels, fuelRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("макс количество загрузки %s кг, \n", loadCapacity);
        System.out.println("Мощность в киловаттах " + kWPower());
        System.out.println();
    }

    public void loadCapacityCheck(int capacity) {
        if (capacity <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
        System.out.println();
    }
}
