package Unit6;

public class TEST {
    public static void main(String[] args) {
        Car car = new Car(250, 200, 4, Brand.BMW, 4, 10, "Sedan", 4);
        car.display();
        car.carDrivingInfo(5);

        CargoCar cargoCar = new CargoCar(200, 150, 2500, Unit6.Brand.MERCEDES, 4, 15, 1500);
        cargoCar.display();
        cargoCar.loadCapacityCheck(900);
        cargoCar.carDrivingInfo(4);

        CivilAir civilAir = new CivilAir(10000, 900, 15000, Unit6.Brand.AIRBUS, 150, 1500, 150, true);
        civilAir.display();
        civilAir.passengersCapacityCheck(100);

        MilitaryAir militaryAir = new MilitaryAir(15000, 2000, 10000, Unit6.Brand.BOEING, 100, 100, true, 4);
        militaryAir.display();
        militaryAir.shot();
        militaryAir.ejection();
    }
}
