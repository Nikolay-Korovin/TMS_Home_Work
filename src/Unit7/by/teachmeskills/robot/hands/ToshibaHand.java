package Unit7.by.teachmeskills.robot.hands;

public class ToshibaHand implements IHand {
    private int price;
    private final String brand = "Toshiba";

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку Toshiba");
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
