package Unit8.by.teachmeskills.Task1.Clothes.Adidas;

import Unit8.by.teachmeskills.Task1.IClothes.IPants;

public class AdidasPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("надевает штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает штаны Adidas");
    }
}
