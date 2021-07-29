package Unit6;

public class AirTransport extends Transport {
    int wingSpan;
    int minRunwayLength;

    public AirTransport(double horsePower, int maxSpeed, double mass, Brand brand, int wingSpan, int minRunwayLength) {
        super(horsePower, maxSpeed, mass, brand);
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("размах крыльев %s метров, минимальная длинна полосы для взлёта %s м. \n", wingSpan, minRunwayLength);
    }
}
