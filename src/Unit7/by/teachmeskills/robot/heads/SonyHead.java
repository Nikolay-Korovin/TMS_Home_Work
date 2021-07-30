package Unit7.by.teachmeskills.robot.heads;

public class SonyHead implements IHead {
    private int price;
    private final String brand = "Sony";

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
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
