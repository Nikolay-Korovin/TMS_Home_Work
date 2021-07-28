package Unit6;

public class TEST {
    public static void main(String[] args) {
        Car car = new Car(Brand.BMW, "Sedan", 4, 100, 250, 1000, 4, 9);
        car.display();
        car.carDrivingInfo(5);

        CargoCar cargoCar = new CargoCar(Brand.MERCEDES, 1000, 250, 130, 2500, 4, 20);
        cargoCar.display();
        cargoCar.loadCapacityCheck(900);
        cargoCar.carDrivingInfo(4);

        CivilAir civilAir = new CivilAir(Brand.AIRBUS, 15000, 900, 150000, true, 150, 90, 1500);
        civilAir.display();
        civilAir.passengersCapacityCheck(100);

        MilitaryAir militaryAir = new MilitaryAir(Brand.BOEING, 20000, 1100, 100000, true, 4, 100, 1400);
        militaryAir.display();
        militaryAir.shot();
        militaryAir.ejection();
    }
}
