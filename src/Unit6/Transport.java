package Unit6;

public abstract class Transport {
    double horsePower;
    int maxSpeed;
    double mass;
    Brand brand;

    public Transport(double horsePower, int maxSpeed, double mass, Brand brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    public void display() {
        System.out.printf("Марка %s ,мощность %s лс, \n", brand, horsePower);
        System.out.printf("макс скорость %s км\\ч, масса %s кг, \n", maxSpeed, mass);
    }

    public double kWPower() {
        return this.horsePower * 0.74;
    }
}
