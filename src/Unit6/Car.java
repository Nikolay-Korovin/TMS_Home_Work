package Unit6;

public class Car extends GroundTransport {
    String bodyWork;
    int numberOfPassengers;

    public Car(double horsePower, int maxSpeed, double mass, Brand brand, int numberOfWheels, double fuelRate, String bodyWork, int numberOfPassengers) {
        super(horsePower, maxSpeed, mass, brand, numberOfWheels, fuelRate);
        this.bodyWork = bodyWork;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("кузов %s, кол. пассажиров %s, \n", bodyWork, numberOfPassengers);
        System.out.println("Мощность в киловаттах " + kWPower());
        System.out.println();
    }
}
