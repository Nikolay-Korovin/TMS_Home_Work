package Unit6;

public abstract class GroundTransport extends Transport {
    int numberOfWheels;
    double fuelRate;

    public GroundTransport(double horsePower, int maxSpeed, double mass, Brand brand, int numberOfWheels, double fuelRate) {
        super(horsePower, maxSpeed, mass, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelRate = fuelRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("количество колёс %s, расход топлива %s л\\100 км. \n", numberOfWheels, fuelRate);
    }

    public void carDrivingInfo(double hours) {
        double distance = hours * maxSpeed;
        System.out.print("За время " + hours + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью ");
        System.out.println(+maxSpeed + " км/ч проедет " + distance + " км и израсходует " + litresPerRange(distance) + " литров топлива.");
        System.out.println();
    }

    private double litresPerRange(double distance) {
        return distance / fuelRate;
    }
}
