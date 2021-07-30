package Unit7.by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {
    private int price;
    private final String brand = "Sony";

    public SonyLeg() {
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делаю шаг вперёд ногами Sony");
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
