package Unit6;

public abstract class Transport {
    double horsePower;
    int maxSpeed;
    double mass;
    Brand brand;

    public double kWpower() {
        return this.horsePower * 0.74;
    }
}
