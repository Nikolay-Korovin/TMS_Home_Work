package Unit7.by.teachmeskills.robot.heads;

public class SamsungHead implements IHead {
    private int price;
    private final String brand = "Samsung";

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
