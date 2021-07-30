package Unit7.by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg {
    private int price;
    private final String brand = "Samsung";

    public SamsungLeg() {
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делаю шаг вперёд ногами Samsung");
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
