package Unit7.by.teachmeskills.robot.heads;

public class ToshibaHead implements IHead {
    private int price;
    private final String brand = "Toshiba";

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
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
