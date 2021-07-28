package Unit6;

public class CivilAir extends AirTransport {
    int numberOfPassengers;
    boolean isBusinessClass;

    CivilAir(Brand brand, double horsePower, int maxSpeed, double mass, boolean isBusinessClass, int numberOfPassengers, int wingSpan, int minRunwayLength) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }

    public void display() {
        System.out.printf("Марка %s, бизнес класс: %s, кол. пассажиров %s, \n", brand, isBusinessClass, numberOfPassengers);
        System.out.printf("мощность %s лс, макс скорость %s, масса %s, \n", horsePower, maxSpeed, mass);
        System.out.printf("размах крыльев %s, минимальная длинна взлёта %s м. \n", wingSpan, minRunwayLength);
        System.out.println("Мощность в киловаттах " + kWpower());
        System.out.println();
    }

    public void passengersCapacityCheck(int capacity) {
        if (capacity <= numberOfPassengers) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
        System.out.println();
    }
}
