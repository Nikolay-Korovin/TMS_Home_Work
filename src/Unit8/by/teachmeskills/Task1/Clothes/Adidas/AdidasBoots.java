package Unit8.by.teachmeskills.Task1.Clothes.Adidas;

import Unit8.by.teachmeskills.Task1.IClothes.IBoots;

public class AdidasBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("надевает ботинки Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает ботинки Adidas");
    }
}
