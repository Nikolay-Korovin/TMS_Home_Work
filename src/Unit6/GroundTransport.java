package Unit6;

public class GroundTransport extends Transport {
    int numberOfWheels;
    double fuelRate;

    public void carDrivingInfo(double hours) {
        double distance = hours * maxSpeed;
        System.out.print("За время " + hours + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью ");
        System.out.println(+maxSpeed + " км/ч проедет " + distance + " км  и израсходует " + litresPerRange(distance) + " литров топлива.");
        System.out.println();
    }

    private double litresPerRange(double distance) {
        return distance / fuelRate;
    }
}
