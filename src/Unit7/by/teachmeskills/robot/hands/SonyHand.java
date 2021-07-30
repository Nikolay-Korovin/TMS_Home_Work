package Unit7.by.teachmeskills.robot.hands;

public class SonyHand implements IHand {
    private int price;
    private final String brand = "Sony";

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку Sony");
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
