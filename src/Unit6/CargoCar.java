package Unit6;

public class CargoCar extends GroundTransport {
    int loadCapacity;

    CargoCar(Brand brand, int loadCapacity, double horsePower, int maxSpeed, double mass, int numberOfWheels, double fuelRate) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.numberOfWheels = numberOfWheels;
        this.fuelRate = fuelRate;
    }

    public void display() {
        System.out.printf("Марка %s, количество груза %s, \n", brand, loadCapacity);
        System.out.printf("мощность %s лс, макс скорость %s, масса %s, \n", horsePower, maxSpeed, mass);
        System.out.printf("количество колёс %s, расход топлива %s. \n", numberOfWheels, fuelRate);
        System.out.println("Мощность в киловаттах " + kWpower());
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
