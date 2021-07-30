package Unit7.by.teachmeskills.robot.hands;

public class SamsungHand implements IHand {
    private int price;
    private final String brand = "Samsung";

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку Samsung");
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
