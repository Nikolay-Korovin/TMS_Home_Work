package Unit6;

public class CivilAir extends AirTransport {
    int numberOfPassengers;
    boolean isBusinessClass;


    public CivilAir(double horsePower, int maxSpeed, double mass, Brand brand, int wingSpan, int minRunwayLength, int numberOfPassengers, boolean isBusinessClass) {
        super(horsePower, maxSpeed, mass, brand, wingSpan, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    @Override
    public void display() {
        YesNo s;
        if (isBusinessClass) {
            s = YesNo.ДА;
        } else {
            s = YesNo.НЕТ;
        }
        super.display();
        System.out.printf("бизнес класс: %s, кол. пассажиров %s. \n", s, numberOfPassengers);
        System.out.println("Мощность в киловаттах " + kWPower());
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
