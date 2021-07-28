package Unit6;

public class MilitaryAir extends AirTransport {
    boolean isCatapult;
    int numberOfRockets;

    MilitaryAir(Brand brand, double horsePower, int maxSpeed, double mass, boolean isCatapult, int numberOfRockets, int wingSpan, int minRunwayLength) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.isCatapult = isCatapult;
        this.numberOfRockets = numberOfRockets;
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }

    public void display() {
        System.out.printf("Марка %s, катапульта: %s, кол. ракет %s, \n", brand, isCatapult, numberOfRockets);
        System.out.printf("мощность %s лс, макс скорость %s, масса %s, \n", horsePower, maxSpeed, mass);
        System.out.printf("размах крыльев %s, минимальная длинна взлёта %s. \n", wingSpan, minRunwayLength);
        System.out.println("Мощность в киловаттах " + kWpower());
        System.out.println();
    }

    public void shot() {
        if (numberOfRockets != 0) {
            System.out.println("Ракета пошла!");
            numberOfRockets--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
        System.out.println();
    }

    public void ejection() {
        if (isCatapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
        System.out.println();
    }
}
