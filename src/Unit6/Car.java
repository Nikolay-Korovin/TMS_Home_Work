package Unit6;

import java.util.Scanner;

public class Car extends GroundTransport {
    String bodyWork;
    int numberOfPassengers;

    Car(Brand brand, String bodyWork, int numberOfPassengers, double horsePower, int maxSpeed, double mass, int numberOfWheels, double fuelRate) {
        this.brand = brand;
        this.bodyWork = bodyWork;
        this.numberOfPassengers = numberOfPassengers;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.numberOfWheels = numberOfWheels;
        this.fuelRate = fuelRate;
    }

    public void display() {
        System.out.printf("Марка %s, кузов %s, кол. пассажиров %s, \n", brand, bodyWork, numberOfPassengers);
        System.out.printf("мощность %s лс, макс скорость %s, масса %s, \n", horsePower, maxSpeed, mass);
        System.out.printf("количество колёс %s, расход топлива %s. \n", numberOfWheels, fuelRate);
        System.out.println("Мощность в киловаттах " + kWpower());
        System.out.println();
    }
}
