package Unit6;

public class MilitaryAir extends AirTransport {
    boolean isCatapult;
    int numberOfRockets;

    public MilitaryAir(double horsePower, int maxSpeed, double mass, Brand brand, int wingSpan, int minRunwayLength, boolean isCatapult, int numberOfRockets) {
        super(horsePower, maxSpeed, mass, brand, wingSpan, minRunwayLength);
        this.isCatapult = isCatapult;
        this.numberOfRockets = numberOfRockets;
    }

    public void display() {
        YesNo s;
        if (isCatapult) {
            s = YesNo.ДА;
        } else {
            s = YesNo.НЕТ;
        }
        super.display();
        System.out.printf("катапульта: %s, кол. ракет %s шт. \n", s, numberOfRockets);
        System.out.println("Мощность в киловаттах " + kWPower());
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
