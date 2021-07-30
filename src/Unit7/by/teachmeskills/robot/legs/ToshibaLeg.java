package Unit7.by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;
    private final String brand = "Toshiba";

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делаю шаг вперёд ногами Toshiba");
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
